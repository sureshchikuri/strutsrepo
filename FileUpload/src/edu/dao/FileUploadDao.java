package edu.dao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.Types;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;

import edu.action.BaseDao;

public class FileUploadDao extends BaseDao{

	private static final String COLUMN="DATA_FIELD";
	private static final String WHERE_QUERY="FROM DATA_IMPORT WHERE REPORT_TYPE=? AND USER_ID=? AND ERROR_MSG IS NOTNULL";
	private static final String ERROR_MSG_COLUMN="ERROR_MSG";
	private static final String COMMA=",";
	private static final String DELETE_TEMP_DATA="DELETE DATA_IMPORT WHERE REPORT_TYPE=? AND USER_ID=?";
	
	
	public void deleteTempData(String reportType, int userId) {

		int noOfRecords=0;
		PreparedStatement ps=null;
		 try{
			 
			 ps=getConnection().prepareStatement(DELETE_TEMP_DATA);
			 ps.setString(1, reportType);
			 ps.setInt(2, userId);
			 noOfRecords=ps.executeUpdate();
		 }catch (Exception e) {
			// TODO: handle exception
		}finally{
			DbUtils.closeQuietly(ps);
		}
	}

	public void saveExcelDataToTemp(List<List<Object>> excelDataList, int noOfColumns,
			int userId, String reportType) {

		String insertQuery=prepareInsertQuery(noOfColumns);
		PreparedStatement ps=null;
		
		try{
			
			ps.getConnection().prepareStatement(insertQuery);
			for(int i=0;i<excelDataList.size();i++){
				List<Object> rowList=excelDataList.get(i);
				ps.setString(1, reportType);
				ps.setInt(2, userId);
				
				for(int column=0;column<rowList.size();column++){
					ps.setString(column+3,(String) rowList.get(column));
				
					
				}
				ps.addBatch();
			}
			ps.executeBatch();
		}catch (Exception e) {
			// TODO: handle exception
		}finally{
			DbUtils.closeQuietly(ps);
			
		}
	}

	private String prepareInsertQuery(int noOfColumns) {

		StringBuffer INSERT_QUERY= new StringBuffer("INSERT INTO DATA_IMPORT(REPORT_TYPE,USER_ID");
		StringBuffer INSERT_QUERY1=new StringBuffer("VALUES(?,?,");
		
		for(int i=0;i<noOfColumns;i++){
			if(i==noOfColumns){

				INSERT_QUERY.append(COLUMN).append(i).append(")");
				INSERT_QUERY1.append("?)");
			}else{

				INSERT_QUERY.append(COLUMN).append(i).append(",");
				INSERT_QUERY1.append("?").append(COMMA);
			}
		}
		
		INSERT_QUERY.append(INSERT_QUERY1);
		return INSERT_QUERY.toString();
	}

	public String importData(int userId, String reportType) {

		String status=null;
		int errorCode=0;
		CallableStatement csmt=null;
		
		try{
			
			csmt =getConnection().prepareCall("{call IMPORT_DATA(?,?,?,?)}");
			csmt.setString(1, reportType);
			csmt.setInt(2,userId);
			csmt.registerOutParameter(3, Types.INTEGER);
			csmt.registerOutParameter(4, Types.VARCHAR);
			csmt.execute();
			errorCode=csmt.getInt(3);
			status=csmt.getString(4);
			System.out.println(errorCode);
			System.out.println(status);
		}catch (Exception e) {
			// TODO: handle exception
		}finally{
			DbUtils.closeQuietly(csmt);
		}
		
		return status;
	}

}
