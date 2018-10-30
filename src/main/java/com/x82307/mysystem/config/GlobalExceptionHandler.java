package com.x82307.mysystem.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.x82307.mysystem.common.ResultData;
import com.x82307.mysystem.common.ServiceException;

//@ControllerAdvice
public class GlobalExceptionHandler {
	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

//	@ExceptionHandler
	public ResultData processException(Exception ex, HttpServletRequest request, HttpServletResponse response) {
		//ex.printStackTrace();

		if (ex instanceof MissingServletRequestParameterException) {
			return new ResultData(400, ex);
		}
		if (ex instanceof ServiceException) {
			logger.error("=======" + ex.getMessage() + "=======");
			return new ResultData(401, "sorry，无权限！");

		}

		return new ResultData(500, ex.getMessage());
	}
}
