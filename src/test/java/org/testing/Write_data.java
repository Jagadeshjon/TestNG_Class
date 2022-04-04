package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data {
	public static void getdata() throws IOException {
	File f = new File("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\demo 1.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fis);
	Sheet s = w.getSheetAt(0);
	Row r = s.getRow(1);
	Cell c = r.getCell(1);
	CellType type = c.getCellType();
	
	if (type.equals(CellType.STRING)) {
		
		String sv = c.getStringCellValue();
		System.out.println(sv);
		
		
	}else if (type.equals(CellType.NUMERIC)) {
		double nv = c.getNumericCellValue();
		System.out.println(nv);
		
	}
	
	
	w.close();
	
	
	
	
	}
	
	
	
	
	
	
public static void main(String[] args) throws IOException {
	getdata();
	
}	
}