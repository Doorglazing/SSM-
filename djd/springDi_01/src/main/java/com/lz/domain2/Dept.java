package com.lz.domain2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dept")
public class Dept {
    @Value("12")
    private int deptno;
    @Value("沈阳")
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

    public String getArea() {
        return area;
    }


}
