package com.lz.domain;

public class Dept {
    private int deptno;
    private String area;

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", area='" + area + '\'' +
                '}';
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
