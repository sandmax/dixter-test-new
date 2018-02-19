package com.dixter.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataHandler {
	
	public static String readDataFromExcel(String fileName , String sheetname , int rowIndex ,int cellIndex)
	{
	String data=null;
	try
	{
		File f=new File("./Test-Data/"+fileName+".xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet st=wb.getSheet(sheetname);
		Row r=st.getRow(rowIndex);
		Cell c=r.getCell(cellIndex);
		 data=c.toString();
		System.out.println(data);

	}
	
	catch (Exception e)
	{
		e.printStackTrace();
	}
	return data;
	}
	
	public static void writeDatatoExcel(String fileName , String sheetname , int rowIndex ,int cellIndex , String value)
	{
		
	try
	{
		File f=new File("./Test-Data/"+fileName+".xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet st=wb.getSheet(sheetname);
		Row r=st.getRow(rowIndex);
		Cell c=r.getCell(cellIndex);
		 c.setCellValue(value);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	
	catch (Exception e)
	{
		e.printStackTrace();
	}

}
	public static String getDataFromPropertyFile(String fileName,String Key)
	{
		String data=null;
	try
	{
		File f=new File("./Config-Data/"+fileName+".properties");
		FileInputStream fis=new FileInputStream(f);
			Properties prop =new Properties();
			prop.load(fis);
			 data=(String)prop.get(Key);
			
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return data;
	}
	
	public static void  setDataToPropertyFile(String fileName,String Key , String value , String comment)
	{
		
	try
	{
		File f=new File("./Config-Data/"+fileName+".properties");
		FileInputStream fis=new FileInputStream(f);
			Properties prop =new Properties();
			prop.load(fis);
		//	 data=(String)prop.get(Key);
			prop.setProperty(Key, value);
			FileOutputStream fos=new FileOutputStream(f);
			prop.store(fos, comment);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}
