package edu.helper;

import java.io.InputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileUploadHelper {

	public static List getExcelData(InputStream stream, int startRow,
			int startColumn, int endColumn) {

		List<Object> excelDataList = new ArrayList();

		List rowList = null;
		XSSFWorkbook wb = null;

		try {

			wb = new XSSFWorkbook(stream);
			XSSFSheet ws = wb.getSheetAt(0);
			int totalRows = ws.getLastRowNum();

			for (int i = startRow; i <= totalRows; i++) {

				rowList = new ArrayList();

				XSSFRow row = ws.getRow(i);

				for (int j = startColumn - 1; j < endColumn; j++) {
					XSSFCell cell = row.getCell(j);

					if (cell != null) {
						switch (cell.getCellType()) {
						case Cell.CELL_TYPE_BOOLEAN:
							rowList.add(new Boolean(cell.getBooleanCellValue())
									.toString());
							System.out.println(cell.getBooleanCellValue()
									+ "\t");
							break;
						case Cell.CELL_TYPE_NUMERIC:
							rowList.add(new Double(cell.getNumericCellValue())
									.toString());
							System.out.println(cell.getNumericCellValue()
									+ "\t");
							break;
						default:
							rowList.add(cell.getStringCellValue());
							System.out.println(cell.getBooleanCellValue()
									+ "\t");
							break;
						}
					} else {
						rowList.add(null);
						System.out.println("" + "\t");
					}
				}

				excelDataList.add(rowList);
				System.out.println();
			}
			System.out.println("ExcelDataList:" + excelDataList);

		} catch (Exception e) {
		}

		return excelDataList;
	}

	public static XSSFWorkbook writeExcel(List<List<Object>> excelDataList,int startRow,String reportType){
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("sheet1");
		Row reportTypeRow=sheet.createRow(0);
		Cell cel=reportTypeRow.createCell(0);
		cel.setCellValue(reportType);
		
		int rownum=startRow-2;
		for(List<Object> rowList:excelDataList){
			Row row=sheet.createRow(rownum++);
			int cellnum=0;
			for(Object obj:rowList){
				Cell cell=row.createCell(cellnum++);
				if(obj instanceof Date){
					cell.setCellValue((Date)obj);
					
				}else if(obj instanceof Boolean){
					cell.setCellValue((Boolean)obj);
				}else if(obj instanceof Double){
					cell.setCellValue((Double)obj);
				}else if(obj instanceof String){
					cell.setCellValue((String)obj);
				}
			}
		}
		return workbook;
	}
}
