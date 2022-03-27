package com.DaraDriven.com;

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

public class DataDriven {
	public static void readData() throws IOException {
		
		File f = new File("C:\\Users\\vijay\\eclipse-workspace\\Maven_Project\\DataSet\\dataexcel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(0);
		Cell cell = row.getCell(0);
		CellType typeOfCell = cell.getCellType();
		if(typeOfCell.equals(CellType.STRING))
		{
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
	}
		else if (typeOfCell.equals(CellType.NUMERIC))
		{
			double numericCellValue = cell.getNumericCellValue();
			int numericValue =(int) numericCellValue;
			System.out.println(numericValue);
		}
		
		else
		{
			System.out.println("Invalid cell Type");
		}
		 
}
	public static void readAllData() throws IOException {	
		File f = new File("C:\\Users\\vijay\\eclipse-workspace\\Maven_Project\\DataSet\\dataexcel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int rowsize = sheetAt.getPhysicalNumberOfRows();
		for(int i=0;i<rowsize;i++)
		{
			Row row = sheetAt.getRow(i);
			int cellsize = row.getPhysicalNumberOfCells();
			for (int j=0;j< cellsize;j++) {
		}
			Cell cell = row.getCell(0);
			CellType typeOfCell = cell.getCellType();
			if(typeOfCell.equals(CellType.STRING))
			{
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
		}
			else if (typeOfCell.equals(CellType.NUMERIC))
			{
				double numericCellValue = cell.getNumericCellValue();
				int numericValue =(int) numericCellValue;
				System.out.println(numericValue);
			}			
			else
			{
				System.out.println("Invalid cell Type");
			}
		}
	}
	public static void main(String[] args) throws IOException {
		
		readData();
		readAllData();
	}
}
