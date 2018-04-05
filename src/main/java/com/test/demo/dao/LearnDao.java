package com.test.demo.dao;

import java.util.Map;

import com.test.demo.entity.LearnResouce;
import com.test.demo.util.Page;

public interface LearnDao {

	int add(LearnResouce learnResouce);

	int update(LearnResouce learnResouce);

	int deleteByIds(String ids);

	LearnResouce queryLearnResouceById(Long id);

	Page queryLearnResouceList(Map<String, Object> params);

}
