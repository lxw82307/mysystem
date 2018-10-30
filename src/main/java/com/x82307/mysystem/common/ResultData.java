package com.x82307.mysystem.common;

public class ResultData {
	private long errorCode = 0;
	private String errorMessage;
	private Object[] data;

	public ResultData(long errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public ResultData(long errorCode, Throwable t) {
		this.errorCode = errorCode;
		this.errorMessage = t.getMessage();
	}

	public ResultData(long errorCode, String errorMessage, Object[] data) {
		this.data = data;
	}

	public ResultData(Object[] data) {
		this.data = data;
	}

	public long getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(long errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Object[] getData() {
		return data;
	}

	public void setData(Object[] data) {
		this.data = data;
	}

}
