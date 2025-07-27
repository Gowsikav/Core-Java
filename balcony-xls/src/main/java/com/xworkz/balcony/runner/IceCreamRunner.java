package com.xworkz.balcony.runner;

import com.xworkz.balcony.dto.IceCreamOrderDTO;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IceCreamRunner {
    public static List<IceCreamOrderDTO> readData(String path) {
        System.out.println("ReadData method");

        List<IceCreamOrderDTO> list = new LinkedList<>();

        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            Workbook workbook = null;
            if (path.endsWith(".xlsx"))
                workbook = new XSSFWorkbook(fileInputStream);
            else if (path.endsWith(".xls"))
                workbook = new HSSFWorkbook(fileInputStream);

            int sheets = 0;
            if (workbook != null)
                sheets = workbook.getNumberOfSheets();
            for (int sheetNum = 0; sheetNum < sheets; sheetNum++) {
                Sheet sheet = workbook.getSheetAt(sheetNum);

                Iterator<Row> rowIterator = sheet.iterator();
                if (rowIterator.hasNext()) {
                    rowIterator.next();
                }

                while (rowIterator.hasNext()) {
                    IceCreamOrderDTO iceCreamOrderDTO = new IceCreamOrderDTO();
                    Row row = rowIterator.next();

                    int columnCount = row.getLastCellNum();
                    for (int colNum = 0; colNum < columnCount; colNum++) {
                        Cell cell = row.getCell(colNum);
                        switch (colNum) {
                            case 0: {
                                if (cell != null && cell.getCellType() == Cell.CELL_TYPE_STRING)
                                    iceCreamOrderDTO.setCustomerName(cell.getStringCellValue());
                                break;
                            }
                            case 1: {
                                if (cell != null && cell.getCellType() == Cell.CELL_TYPE_STRING)
                                    iceCreamOrderDTO.setFlavour(cell.getStringCellValue());
                                break;
                            }
                            case 2: {
                                if (cell != null && cell.getCellType() == Cell.CELL_TYPE_NUMERIC)
                                    iceCreamOrderDTO.setQuantity((int) cell.getNumericCellValue());
                                break;
                            }
                            case 3: {
                                if (cell != null && cell.getCellType() == Cell.CELL_TYPE_STRING)
                                    iceCreamOrderDTO.setTakeAway(cell.getStringCellValue());
                                break;
                            }
                            case 4: {
                                if (cell != null && cell.getCellType() == Cell.CELL_TYPE_STRING)
                                    iceCreamOrderDTO.setAddOn(cell.getStringCellValue());
                                break;
                            }
                            case 5: {
                                iceCreamOrderDTO.setCouponCode(cell.getStringCellValue());
                            }
                        }
                    }
                    list.add(iceCreamOrderDTO);
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return list;
    }

    public static void main(String[] args) {
        String path = "D:\\Java\\Excel files\\IceCream-order.xlsx";
        List<IceCreamOrderDTO> list = readData(path);
        if(list.isEmpty())
        {
            System.out.println("List is empty");
        }
        else {
            System.out.printf("%-18s%-12s%-12s%-12s%-12s%-10s%n",
                    "Customer Name", "Flavour", "Quantity", "Take Away", "Add on", "Coupon");
            list.stream()
                    .map(e -> String.format("%-15s %-15s %-10d %-12s %-10s %-10s",
                            e.getCustomerName(),
                            e.getFlavour(),
                            e.getQuantity(),
                            e.getTakeAway(),
                            e.getAddOn(),
                            e.getCouponCode()))
                    .forEach(System.out::println);


            System.out.println("==========================================================");
            String filePath = "D:\\Java\\Excel files\\IceCream-orderWrite.xlsx";

            IceCreamWrite.orderWrite(filePath,list);
        }
    }
}
