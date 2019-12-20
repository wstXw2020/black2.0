package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IKqjiluDAO;
import com.woniu.pojo.Kqjilu;
@Repository
@Transactional
public class KqjiluDAOImpl implements IKqjiluDAO {
    
	@Autowired
	private SessionFactory sessionFactory;
	
	

	@Override
	public List<Kqjilu> findAll() {
		List<Kqjilu> kq =sessionFactory.getCurrentSession().createCriteria(Kqjilu.class).list();
		
		//System.out.println(kq);
		return kq;
	}



	@Override
	public void save(Kqjilu obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(obj);
	}

}
