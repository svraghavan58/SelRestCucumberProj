package com.test.utilities;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public HSSFWorkbook hssfWorkbook;
	public HSSFSheet hssfSheet;
	public HSSFCell hssfCell;
	public XSSFWorkbook xssfWorkbook;
	public XSSFSheet xssfSheet;
	public XSSFCell xssfCell;
	
public int getTotalRows(String fileName,String sheetName)
{
		int totalRows=0;
		File file=new File(fileName);
		
		try
		{
			
		FileInputStream fis=new FileInputStream(file);
		if(fileName.contains(".xlsx"))
		{
			xssfWorkbook=new XSSFWorkbook(fis);
			xssfSheet=xssfWorkbook.getSheet(sheetName);
			totalRows=xssfSheet.getPhysicalNumberOfRows();
		}
		else if(fileName.contains(".xls"))
		{
			hssfWorkbook=new HSSFWorkbook(fis);
			hssfSheet=hssfWorkbook.getSheet(sheetName);
			totalRows=hssfSheet.getPhysicalNumberOfRows();
		}
		else
		{
			System.out.println("please enter the correct fileName");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return totalRows;
	
		
}
	
public String getStringValue(String fileName,String sheetName,int row,int cols)
{

	File file=new File(fileName);
	String value=null;
	
	try
	{
		
	FileInputStream fis=new FileInputStream(file);
	if(fileName.contains(".xlsx"))
	{
		xssfWorkbook=new XSSFWorkbook(fis);
		xssfSheet=xssfWorkbook.getSheet(sheetName);
		value=xssfSheet.getRow(row).getCell(cols).getStringCellValue();
	}
	else if(fileName.contains(".xls"))
	{
		hssfWorkbook=new HSSFWorkbook(fis);
		hssfSheet=hssfWorkbook.getSheet(sheetName);
		value=hssfSheet.getRow(row).getCell(cols).getStringCellValue();
	}
	else
	{
		System.out.println("please enter the correct fileName");
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return value;

}
public void writeToSheet(String fileName,String sheetName,int row,int cols,String message)
{

	File file=new File(fileName);

	
	try
	{
		
	FileInputStream fis=new FileInputStream(file);
	FileOutputStream fos=new FileOutputStream(file);
	if(fileName.contains(".xlsx"))
	{
		xssfWorkbook=new XSSFWorkbook(fis);
		xssfSheet=xssfWorkbook.getSheet(sheetName);
		xssfCell=xssfSheet.getRow(row).getCell(cols);
		xssfCell.setCellValue(message);
		xssfWorkbook.write(fos);
	}
	else if(fileName.contains(".xls"))
	{
		hssfWorkbook=new HSSFWorkbook(fis);
		hssfSheet=hssfWorkbook.getSheet(sheetName);
		hssfCell=hssfSheet.getRow(row).getCell(cols);
		hssfCell.setCellValue(message);
		hssfWorkbook.write(fos);
	}
	else
	{
		System.out.println("please enter the correct fileName");
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
}
