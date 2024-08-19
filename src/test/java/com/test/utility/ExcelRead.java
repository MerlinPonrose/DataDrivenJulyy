package com.test.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.test.jiomart.BaseClass;

public class ExcelRead extends BaseClass{
	
	public static void readexcel() throws IOException
	{
		File f = new File("C:\\neworkspace\\DataDrivenJuly\\Resource\\TestDattaa.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum()+1;
		
		int colcount = sheet.getRow(0).getLastCellNum();
		
		System.out.println(rowcount);
		System.out.println(colcount);
		
		for(int i=0;i<colcount;i++)
		{
			map.put(format.formatCellValue(sheet.getRow(0).getCell(i)), format.formatCellValue(sheet.getRow(1).getCell(i)));
		
		}
		System.out.println(map);
		
		
	}
	
	public String getMapValue(String key) throws IOException
	{
		readexcel();
		return map.get(key);
	}

}
