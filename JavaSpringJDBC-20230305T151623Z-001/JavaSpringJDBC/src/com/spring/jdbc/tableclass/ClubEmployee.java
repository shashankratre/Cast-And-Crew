package com.spring.jdbc.tableclass;

public class ClubEmployee {
	private int EMPID;
	private String FIRST_NAME;
	private String LAST_NAME;
	private int AGE;

	public ClubEmployee() {
		super();
	}

	public ClubEmployee(int eMPID, String fIRST_NAME, String lAST_NAME, int aGE) {
		super();
		EMPID = eMPID;
		FIRST_NAME = fIRST_NAME;
		LAST_NAME = lAST_NAME;
		AGE = aGE;
	}

	public int getEMPID() {
		return EMPID;
	}

	public String getFIRST_NAME() {
		return FIRST_NAME;
	}

	public String getLAST_NAME() {
		return LAST_NAME;
	}

	public int getAGE() {
		return AGE;
	}

	public void setEMPID(int eMPID) {
		EMPID = eMPID;
	}

	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}

	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}

	public void setAGE(int aGE) {
		AGE = aGE;
	}

	@Override
	public String toString() {
		return "EMPID :  " + EMPID + ",\nFIRST_NAME :  " + FIRST_NAME + ",\nLAST_NAME :  " + LAST_NAME + ",\nAGE :  "
				+ AGE;
	}

}
