/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.vcs.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;


public class StudentForm extends ActionForm {
	
	private String text;
	private String password;
	private String textArea;
	private String select;
	private String radio;
	private String checkbox;
	private String[] multiBox;
	private String hidden;

	
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getText() {
		return text;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPassword() {
		return password;
	}


	public void setTextArea(String textArea) {
		this.textArea = textArea;
	}


	public String getTextArea() {
		return textArea;
	}


	public void setSelect(String select) {
		this.select = select;
	}


	public String getSelect() {
		return select;
	}


	public void setRadio(String radio) {
		this.radio = radio;
	}


	public String getRadio() {
		return radio;
	}


	public void setCheckbox(String checkbox) {
		this.checkbox = checkbox;
	}


	public String getCheckbox() {
		return checkbox;
	}


	public void setMultiBox(String[] multiBox) {
		this.multiBox = multiBox;
	}


	public String[] getMultiBox() {
		return multiBox;
	}


	public void setHidden(String hidden) {
		this.hidden = hidden;
	}


	public String getHidden() {
		return hidden;
	}




	
}