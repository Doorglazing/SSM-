package com.lz.service.impl;

import com.lz.service.IEmpService;

public class EmpServiceImpl implements IEmpService {
    public  EmpServiceImpl(){
        System.out.println("构造方法");
    }
    @Override
    public void doSome() {
        System.out.println("doSome");
    }
}
