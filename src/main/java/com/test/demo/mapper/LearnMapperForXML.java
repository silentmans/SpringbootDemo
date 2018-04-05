package com.test.demo.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.test.demo.entity.LearnResouce;

@Component
public interface LearnMapperForXML {

	int add(LearnResouce learnResouce);

	int update(LearnResouce learnResouce);

	int deleteByIds(String[] ids);

	LearnResouce queryLearnResouceById(Long id);

	public List<LearnResouce> queryLearnResouceList(Map<String, Object> params);
}
