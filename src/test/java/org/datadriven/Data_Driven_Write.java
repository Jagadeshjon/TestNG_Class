package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Write {
	
	public static void main(String[] args) throws IOException {
		
	
		File f = new File("C:\\Users\\Naveen kumar\\Desktop\\Excel Domo file\\write excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		wb.createSheet("User_data").createRow(0).createCell(0).setCellValue("Email");
		wb.getSheet("User_data").getRow(0).createCell(1).setCellValue("Password");
		wb.getSheet("User_data").createRow(1).createCell(0).setCellValue("Jagadeshjo33@gmail.com");
		wb.getSheet("User_data").getRow(1).createCell(1).setCellValue("raiden");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("write Successfully");
		
		
		
		
	}

}
