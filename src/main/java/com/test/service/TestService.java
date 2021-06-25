package com.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.test.model.Result;

@Service
public class TestService {

	public List<Result> getData(){
		List<Result> results = new ArrayList<Result>();
		Result res = new Result();
		res.setId(1);
		res.setName("Test");
		res.setDesc("Jenkins Build");
		res.setVersion("1.0");
		results.add(res);
		return results;
	}
	
}
