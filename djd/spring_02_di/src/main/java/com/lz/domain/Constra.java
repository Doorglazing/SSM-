package com.lz.domain;

import javax.swing.plaf.PanelUI;

public class Constra {
    private String name;
    private int age;
    private Dept dapt;
    public Constra(){}

    @Override
    public String toString() {
        return "Constra{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dapt=" + dapt +
                '}';
    }

    public Constra(String name, int age, Dept dept){
        this.age = age;
        this.dapt = dept;
        this.name = name;
    }

}
