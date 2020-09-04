package com.neuedu.dao;

import com.neuedu.domain.Emp;
import com.neuedu.domain.QueryOv;

import java.util.List;

public interface EmpDao {
    // 查询所有人
    List<Emp> findAll();

    // in 查询
    List<Emp> findIn(QueryOv queryOv);

    // 判断查询条件
    List<Emp> findSelect(QueryOv queryOv);

}
