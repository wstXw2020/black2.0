package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IKaoshiDAO;
import com.woniu.pojo.Kaoshi;
import com.woniu.service.IKaoshiService;
@Service
@Transactional
public class KaoshiServiceImpl implements IKaoshiService{
    @Autowired
	IKaoshiDAO kd;
	@Override
	public List<Kaoshi> findAll() {
		
		return kd.findAll();
	}

}
