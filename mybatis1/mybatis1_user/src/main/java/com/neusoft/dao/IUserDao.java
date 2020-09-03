package com.neusoft.dao;

import com.neusoft.domain.User;

import java.io.Serializable;
import java.util.List;

public interface IUserDao {
    List<User> findAll();
    List<User> findById(int id);
}
