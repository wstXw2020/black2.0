package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IKqjiluDAO;
import com.woniu.pojo.Kqjilu;
import com.woniu.service.IKqjiluService;

@Service
@Transactional
public class KqjiluServiceImpl implements IKqjiluService{
  
	@Autowired
	IKqjiluDAO kd;
	@Override
	public List<Kqjilu> findAll() {
		
		return kd.findAll();
	}

}
