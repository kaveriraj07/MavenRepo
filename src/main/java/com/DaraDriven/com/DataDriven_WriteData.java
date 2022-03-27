package com.DaraDriven.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_WriteData {
	
	public static void writeData() throws IOException {
		
		File f = new File("C:\\Users\\vijay\\eclipse-workspace\\Maven_Project\\DataSet\\write excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		wb.getSheetAt(0).getRow(0).createCell(1).setCellValue("password");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
	}

	public static void main(String[] args) throws IOException {
		writeData();
		
	}
}
