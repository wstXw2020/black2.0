package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IKaoshiDAO;
import com.woniu.pojo.Kaoshi;
@Repository
@Transactional
public class KaoshiDAOImpl implements IKaoshiDAO {
    
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void save(Kaoshi obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Kaoshi obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kaoshi findOne() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Kaoshi> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(Kaoshi.class).list();
	}

}
