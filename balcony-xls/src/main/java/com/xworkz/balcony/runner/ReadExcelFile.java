package com.xworkz.balcony.runner;

import com.xworkz.balcony.dto.CountryDTO;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadExcelFile {

    public static List<CountryDTO> readData(String filePath) {
        List<CountryDTO> list = new ArrayList<>();

        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {

            Workbook workbook = null;
            if (filePath.toLowerCase().endsWith(".xlsx")) {
                workbook = new XSSFWorkbook(fileInputStream);
            } else if (filePath.toLowerCase().endsWith(".xls")) {
                workbook = new HSSFWorkbook(fileInputStream);
            }
            int noOfSheets = 1;
            if (workbook != null) {
                noOfSheets = workbook.getNumberOfSheets();
            }
            for (int i = 0; i < noOfSheets; i++) {
                Sheet sheet = workbook != null ? workbook.getSheetAt(i) : null;
                if (sheet == null) {
                    System.out.println("Sheet is null");
                    break;
                }
                for (Row cells : sheet) {
                    String countryName = "";
                    int countryCode = 0;

                    Cell cell1 = cells.getCell(1);
                    Cell cell2 = cells.getCell(2);

                    if (cell1 != null && cell1.getCellType() == Cell.CELL_TYPE_STRING) {
                        countryName = cell1.getStringCellValue();
                    }
                    if (cell2 != null && cell2.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                        countryCode = (int) cell2.getNumericCellValue();
                    }

                    CountryDTO countryDTO = new CountryDTO(countryName, countryCode);
                    list.add(countryDTO);
                }
            }

        } catch (
                FileNotFoundException e) {
            System.out.println("File not found");
        } catch (
                IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }


    public static void main(String[] args) {

        String filePath = "D:\\Java\\Excel files\\CountryList.xlsx";
        List<CountryDTO> countryList = readData(filePath);
        countryList.stream().map(e -> e.getCountryName() + "---" + e.getCountryCode()).forEach(System.out::println);

    }
}
