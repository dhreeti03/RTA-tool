package com.dhreeti.springbootRTA.utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtils {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public excelUtils(String excelPath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void getCellData(int rowNum, int colNum) {

		DataFormatter formatter = new DataFormatter();
		Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
		System.out.println(value);
	}

	public static void getRows() {

		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows " + rowCount);
	}

}