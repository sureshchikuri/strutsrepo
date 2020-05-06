package edu.action;

import java.sql.Connection;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;

import edu.dao.ConnectionUtil;
import edu.dao.FileUploadDao;

public class FileUploadService {

	public String importExcelData(List excelDataList, int noOfColumns,
			String reportType, int userId) {

		String status =null;
		Connection connection=null;
		
		FileUploadDao excelDao=new FileUploadDao();
		
		try{
			
			connection=ConnectionUtil.getConnection();
			excelDao.setConnection(connection);
			excelDao.deleteTempData(reportType,userId);
			connection.commit();
			excelDao.saveExcelDataToTemp(excelDataList,noOfColumns,userId,reportType);
			connection.commit();
			status=excelDao.importData(userId,reportType);
			connection.commit();
			
			
		}catch (Exception e) {

		}finally{
			DbUtils.closeQuietly(connection);
		}
		
		return status;
	}

}
