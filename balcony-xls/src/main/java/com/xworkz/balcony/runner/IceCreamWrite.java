package com.xworkz.balcony.runner;

import com.xworkz.balcony.dto.IceCreamOrderDTO;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class IceCreamWrite {

    public static void orderWrite(String path, List<IceCreamOrderDTO> list)
    {
        System.out.println("order write method");

        Workbook workbook=null;
        if(path.endsWith(".xlsx"))
            workbook=new XSSFWorkbook();
        else if (path.endsWith(".xls"))
            workbook=new HSSFWorkbook();

        if(workbook==null)
        {
            return;
        }
        Sheet sheet=workbook.createSheet("Ice cream order");
        Iterator<IceCreamOrderDTO> iterator=list.iterator();
        Row header= sheet.createRow(0);
        header.createCell(0).setCellValue("Customer Name");
        header.createCell(1).setCellValue("Flavour");
        header.createCell(2).setCellValue("Quantity");
        header.createCell(3).setCellValue("Take Away");
        header.createCell(4).setCellValue("Add on");
        header.createCell(5).setCellValue("Coupon Code");
        int rowIndex=0;
        while (iterator.hasNext())
        {
            IceCreamOrderDTO iceCreamOrderDTO=iterator.next();
            Row row=sheet.createRow(++rowIndex);
            Cell cell1= row.createCell(0);
            cell1.setCellValue(iceCreamOrderDTO.getCustomerName());
            Cell cell2= row.createCell(1);
            cell2.setCellValue(iceCreamOrderDTO.getFlavour());
            Cell cell3= row.createCell(2);
            cell3.setCellValue(iceCreamOrderDTO.getQuantity());
            Cell cell4= row.createCell(3);
            cell4.setCellValue(iceCreamOrderDTO.getTakeAway());
            Cell cell5= row.createCell(4);
            cell5.setCellValue(iceCreamOrderDTO.getAddOn());
            Cell cell6= row.createCell(5);
            cell6.setCellValue(iceCreamOrderDTO.getCouponCode());
        }
        try(FileOutputStream file=new FileOutputStream(path)){
            workbook.write(file);
            System.out.println("File successfully written");
        }catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
