package edu.form;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class FileUploadForm extends ActionForm{

	private static final long serialVersionUID = 1L;
	private FormFile excelFile;
	private String reportType;
	
	public FormFile getExcelFile() {
		return excelFile;
	}
	public void setExcelFile(FormFile excelFile) {
		this.excelFile = excelFile;
	}
	public String getReportType() {
		return reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	@Override
	public String toString() {
		return "FileUploadForm [excelFile=" + excelFile + ", reportType="
				+ reportType + "]";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
