package com.lz.service.impl;

import com.lz.service.SomeService;

public class SomeService1 implements SomeService {
    @Override
    public void doSome() {
        System.out.println("doSome");
    }

    @Override
    public void doOther() {
        System.out.println("doOther");
    }
}
