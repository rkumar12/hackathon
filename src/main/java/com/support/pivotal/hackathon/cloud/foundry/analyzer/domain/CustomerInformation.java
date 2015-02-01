package com.support.pivotal.hackathon.cloud.foundry.analyzer.domain;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class CustomerInformation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8601924895440245163L;

	private String fName;
	private String lName;
	private String emailId;
	private String technology;
	private String runTimeEnvironment;
	private String deploymnetType;
	private MultipartFile sourceCode;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getRunTimeEnvironment() {
		return runTimeEnvironment;
	}

	public void setRunTimeEnvironment(String runTimeEnvironment) {
		this.runTimeEnvironment = runTimeEnvironment;
	}

	public String getDeploymnetType() {
		return deploymnetType;
	}

	public void setDeploymnetType(String deploymnetType) {
		this.deploymnetType = deploymnetType;
	}

	public MultipartFile getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(MultipartFile sourceCode) {
		this.sourceCode = sourceCode;
	}

}
