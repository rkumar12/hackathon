package com.support.pivotal.hackathon.cloud.foundry.analyzer.domain;

import java.io.InputStream;
import java.io.Serializable;

public class FileDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6798833932680402604L;
	
	private int id;
	
	private String fileName;
	
	private InputStream fileInputStream;
	
	private int fileLength;
	
	
	public FileDetails(int id, String fileName, InputStream fileInputStream){
		this.id=id;
		this.fileName=fileName;
		this.fileInputStream=fileInputStream;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public InputStream getFileInputStream() {
		return fileInputStream;
	}

	public void setFileInputStream(InputStream fileInputStream) {
		this.fileInputStream = fileInputStream;
	}

	public int getFileLength() {
		return fileLength;
	}

	public void setFileLength(int fileLength) {
		this.fileLength = fileLength;
	}

}
