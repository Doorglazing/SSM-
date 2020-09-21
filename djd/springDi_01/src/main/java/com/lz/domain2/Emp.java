package com.lz.domain2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Emp {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private int age;
    @Autowired
    @Qualifier("dept")
    private Dept dept1;

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dept1=" + dept1 +
                '}';
    }

}
