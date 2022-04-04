package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel_domo {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\\\Users\\\\Naveen kumar\\\\Desktop\\\\Excel Domo file\\\\write excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("User_1").createRow(0).createCell(0).setCellValue("Name");
		wb.getSheet("User_1").createRow(1).createCell(0).setCellValue("PalPandiyan");
		wb.getSheet("User_1").createRow(2).createCell(0).setCellValue("JagadeshWaran");
		wb.getSheet("User_1").createRow(3).createCell(0).setCellValue("Vignesh");
		wb.getSheet("User_1").getRow(0).createCell(1).setCellValue("Email");
		wb.getSheet("User_1").getRow(1).createCell(1).setCellValue("PalPandiyan@gmail.com");
		wb.getSheet("User_1").getRow(2).createCell(1).setCellValue("Jagadesh@gmail.com");
		wb.getSheet("User_1").getRow(3).createCell(1).setCellValue("Vignesh@gmail.com");
		wb.getSheet("User_1").getRow(0).createCell(2).setCellValue("Password");
		wb.getSheet("User_1").getRow(1).createCell(2).setCellValue("Eldergod");
		wb.getSheet("User_1").getRow(2).createCell(2).setCellValue("Raiden");
		wb.getSheet("User_1").getRow(3).createCell(2).setCellValue("Tundergod");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		
		System.out.println("The write has been sucessfully done in Excel");
		
		
		
		 
	}

}
