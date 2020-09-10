package com.neuedu.dao;

import com.neuedu.domain.Emp;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {
    List<Emp> findAll();
}
