package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Result;
import com.test.service.TestService;

@RestController
public class TestController {

	@Autowired
	TestService testService;

	@RequestMapping(path = "/getData", produces = "application/json; charset=UTF-8")
	@ResponseBody
	public List<Result> getResultData() {
		return testService.getData();
	}
}
