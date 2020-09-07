package com.neuedu.domain;

import java.util.Date;

public class User {
    private Date birthDay;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "birthDay=" + birthDay +
                ", name='" + name + '\'' +
                '}';
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
