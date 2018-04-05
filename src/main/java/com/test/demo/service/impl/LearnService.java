package com.test.demo.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.dao.LearnDao;
import com.test.demo.entity.LearnResouce;
import com.test.demo.service.ILearnService;
import com.test.demo.util.Page;

@Service
public class LearnService implements ILearnService{

	    @Autowired
	    private LearnDao learnDao;
	    @Override
	    public int add(LearnResouce learnResouce) {
	        return this.learnDao.add(learnResouce);
	    }

	    @Override
	    public int update(LearnResouce learnResouce) {
	        return this.learnDao.update(learnResouce);
	    }

	    @Override
	    public int deleteByIds(String ids) {
	        return this.learnDao.deleteByIds(ids);
	    }

	    @Override
	    public LearnResouce queryLearnResouceById(Long id) {
	        return this.learnDao.queryLearnResouceById(id);
	    }

	    @Override
	    public Page queryLearnResouceList(Map<String,Object> params) {
	        return this.learnDao.queryLearnResouceList(params);
	    }
}
