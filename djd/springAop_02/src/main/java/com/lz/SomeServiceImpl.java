package com.lz;


import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service("someService")
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String str) {
        System.out.println(str + "doSome");
    }
    @Override
    public String dothre(String str) {
        System.out.println("h");
        return str;
    }
    @Override
    public String doFirst(String str) {
        System.out.println(str);
        return str;
    }

}
