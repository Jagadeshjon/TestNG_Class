package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Domo_Particular_Data {

	public static void Particular_Celldata() throws IOException {

		File f = new File("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\domo 3.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);
		// Sheet s = wb.getSheet("");
		Row r = s.getRow(2);
		Cell c = r.getCell(1);
		CellType type = c.getCellType();
		if (type.equals(CellType.STRING)) {

			String stringvalue = c.getStringCellValue();
			System.out.println("Email id:" + stringvalue);

		} else if (type.equals(CellType.NUMERIC)) {
			double numericValue = c.getNumericCellValue();
			int a = (int) numericValue;
			System.out.println("Email passord:" + a);
		}

		wb.close();
	}

	public static void allData() throws IOException {

		File f = new File("C:\\Users\\Naveen kumar\\eclipse-workspace\\Maven_Project_Class\\domo 3.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			Row r = s.getRow(i); // i represents row index.
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j); // j represent column index
				CellType type = c.getCellType();
				if (type.equals(CellType.STRING)) {
					String sv = c.getStringCellValue();
					System.out.println(sv);
				} else if (type.equals(CellType.NUMERIC)) {
					double nv = c.getNumericCellValue();
					int d = (int) nv;
					String string = Integer.toString(d);
					System.out.println(string);
				}
			}
		}
		wb.close();
	}

	public static void main(String[] args) throws IOException {
		allData();

	}

}
