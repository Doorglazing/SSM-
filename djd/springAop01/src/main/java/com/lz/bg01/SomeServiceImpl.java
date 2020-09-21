package com.lz.bg01;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String str) {
        System.out.println(str + "doSome");
    }
}
