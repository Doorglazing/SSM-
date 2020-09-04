package com.neusoft.dao;

import com.neusoft.domain.Emp;

import java.util.List;

public interface EmpDao {
    //
    List<Emp> findAll();

    Emp findById(Integer emp_no);

    int updateEmp(Emp emp);

    int insertIntoEmp(Emp emp);

    Emp likeEmp(String e_name);

    int deleteEmp(Integer emp_no);
}
