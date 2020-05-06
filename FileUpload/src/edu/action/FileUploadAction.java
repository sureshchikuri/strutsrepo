package edu.action;

import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;
import org.apache.struts.util.MessageResources;

import com.sun.corba.se.spi.activation.Repository;

import edu.form.FileUploadForm;
import edu.helper.FileUploadHelper;

public class FileUploadAction extends Action {

	private static final String SUCCESS="SUCCESS";
	private FileUploadService fileUploadService =new FileUploadService();
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		FileUploadForm fileUploadForm=(FileUploadForm) form;
		FormFile srcFormFile =fileUploadForm.getExcelFile();
		InputStream inputStream=null;
		String reportType=null;
		int userId=2;
		
		try{
			inputStream =srcFormFile.getInputStream();
			reportType=fileUploadForm.getReportType();
			
			MessageResources messageResources=MessageResources.getMessageResources("com.vcs.struts.ApplicationResources");
			
			int startRow=Integer.parseInt(messageResources.getMessage(reportType.toUpperCase()+"_START_ROW"));
			int startColumn=Integer.parseInt(messageResources.getMessage(reportType.toUpperCase()+"_START_COLUMN"));
			int endColumn=Integer.parseInt(messageResources.getMessage(reportType.toUpperCase()+"_END_COLUMN"));
			
			List excelDataList=FileUploadHelper.getExcelData(inputStream,startRow,startColumn,endColumn);
			
			String status=fileUploadService.importExcelData(excelDataList,endColumn,reportType,userId);
			
		}catch (Exception e) {
		}
		
		return mapping.findForward("success");
	}
}
