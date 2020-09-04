package com.neuedu.domain;

import java.util.List;

public class QueryOv {

    private Emp emp;
    private List<Integer> list;

    @Override
    public String toString() {
        return "QueryOv{" +
                "emp=" + emp +
                ", list=" + list +
                '}';
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }
}
