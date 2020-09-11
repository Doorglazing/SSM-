package com.neuedu.dao;

import com.neuedu.domain.Dept;
import com.neuedu.domain.Emp;

import java.util.List;

public interface DeptDao {
    List<Dept> deptFindAll();

    Emp deptFindById(int id);

    void deptDeleteById(int id);

    void deptInsertInto(Emp emp);

    void deptUpdate(Emp emp);
}
