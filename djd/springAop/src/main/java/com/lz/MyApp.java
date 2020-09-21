package com.lz;

import com.lz.proxy.MyInvocationHandler;
import com.lz.service.SomeService;
import com.lz.service.impl.SomeService1;

import java.lang.reflect.Proxy;

public class MyApp {
    public static void main(String[] args) {
        //创建目标对象
        SomeService1 target = new SomeService1();
        // 创建InvocationHandler对象
        MyInvocationHandler handler = new MyInvocationHandler(target);
        // 使用proxy创建动态代理
        SomeService o = (SomeService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler
        );
        // 通过代理来调用方法
        o.doSome();
        o.doOther();
    }
}
