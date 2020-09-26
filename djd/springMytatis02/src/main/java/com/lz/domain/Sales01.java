package com.lz.domain;

public class Sales01 {
    private int id;
    private int gid;
    private int nums;

    @Override
    public String toString() {
        return "Sales{" +
                "id=" + id +
                ", gid=" + gid +
                ", nums=" + nums +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }
}
