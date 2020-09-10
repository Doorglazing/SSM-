package com.neuedu.dao;

import com.neuedu.domain.Emp;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {

    List<Emp> findAll();

    Emp findById(int id);

    void deleteById(int id);

    void insertInto(Emp emp);

    void update(Emp emp);
}
