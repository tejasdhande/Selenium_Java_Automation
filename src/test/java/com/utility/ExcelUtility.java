package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static String getTestData(int rowNumber, int cellNumber) throws InvalidFormatException, IOException {
		
		// Create File Object
		File file = new File("C:\\Users\\Kanaka\\Desktop\\TestData.xlsx");
		
		//Creak Workbook Object
		@SuppressWarnings("resource")
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		//create sheet object 
		XSSFSheet sheet = book.getSheetAt(0);
		
		//specify the row and cell number
		return sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();
		
	}
}
