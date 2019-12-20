package com.woniu.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.woniu.pojo.Kqjilu;

public interface IKqjiluDAO {
         void save(Kqjilu obj);
	    List<Kqjilu> findAll();
}
