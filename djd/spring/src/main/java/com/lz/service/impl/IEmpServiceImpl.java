package com.lz.service.impl;

import com.lz.proxy.IEmpProxy;
import com.lz.service.IEmpService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class IEmpServiceImpl implements IEmpService {
    @Override
    public void empFindAll() {

        IEmpProxy iEmpProxy = new IEmpProxy();
        System.out.println(iEmpProxy.empFindAll());
    }

    public static void main(String[] args) {
        IEmpServiceImpl iEmpService1 = new IEmpServiceImpl();
        IEmpService iEmpService = (IEmpService) Proxy.newProxyInstance(
                // 获取类加载器
                iEmpService1.getClass().getClassLoader(),
                // 目标类所实现的所有接口
                iEmpService1.getClass().getInterfaces(),
                // 匿名内部类
                new InvocationHandler() {
                    // proxy代理对象
                    // method目标方法
                    // args目标方法的参数列表
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        return null;
                    }
                });
    }
}
