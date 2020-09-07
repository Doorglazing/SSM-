package com.neuedu.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Account implements Serializable {
    private String username;
    private String password;
    private List<User> lists;
    private Map<String, User> maps;

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", lists=" + lists +
                ", maps=" + maps +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User> getLists() {
        return lists;
    }

    public void setLists(List<User> lists) {
        this.lists = lists;
    }

    public Map<String, User> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, User> maps) {
        this.maps = maps;
    }
}
