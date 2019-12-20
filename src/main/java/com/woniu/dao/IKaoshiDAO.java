package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Kaoshi;

public interface IKaoshiDAO {
    void save(Kaoshi obj);
    void update(Kaoshi obj);
    Kaoshi findOne();
    List<Kaoshi> findAll();
}
