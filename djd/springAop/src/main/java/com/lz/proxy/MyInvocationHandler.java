package com.lz.proxy;

import com.lz.service.SomeService;
import com.lz.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private SomeService target ;

    public MyInvocationHandler(SomeService target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        ServiceTools.logs();
        // 方法名
        Object invoke = method.invoke(target, args);
        ServiceTools.fq();
        return invoke;
    }
}
