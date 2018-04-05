package com.test.demo.service;

import java.util.Map;

import com.test.demo.entity.LearnResouce;
import com.test.demo.util.Page;

public interface ILearnService {
	
	int add(LearnResouce learnResouce);

	int update(LearnResouce learnResouce);

	int deleteByIds(String ids);

	LearnResouce queryLearnResouceById(Long learnResouce);

	Page queryLearnResouceList(Map<String, Object> params);
	
}
