package com.x82307.mysystem.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.x82307.mysystem.common.ResultData;

@RestController
public class RestErrorController implements ErrorController {
	private static final String PATH = "/error";

	@Override
	public String getErrorPath() {
		return null;
	}

	@RequestMapping(value = PATH, produces = { MediaType.APPLICATION_JSON_VALUE }, method=RequestMethod.GET)
	public ResultData error(HttpServletRequest request, HttpServletResponse response) {
		Integer errorCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		String errorMessage = (String) request.getAttribute("javax.servlet.error.message");
		return new ResultData(errorCode, errorMessage);
	}

}
