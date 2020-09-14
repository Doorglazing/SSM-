package com.lz.service.impl;

import com.lz.proxy.IEmpProxy;
import com.lz.service.IEmpService;


public class IEmpServiceImpl implements IEmpService {
    @Override
    public void empFindAll() {
        IEmpProxy iEmpProxy = new IEmpProxy();
        System.out.println(iEmpProxy.empFindAll());
    }

    public static void main(String[] args) {
        new IEmpServiceImpl().empFindAll();
    }
}
