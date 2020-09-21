package com.lz.bg01;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 是一个切面：目的是增强目标类的业务功能
 */
@Aspect
public class MyAspect {
    /**
     * 定义方法 方法是实现切面功能的
     *  方法的定义要求：
     *      1. 公共方法 public
     *      2. 方法没有返回值
     *      3. 方法名称自定义
     *      4. 方法可以有参数, 也可以没有参数
     *         如果有参数,参数不是自定义的,有几个参数类型可以使用
     */
    /**
     * @Before 前置通知
     *  value 是切入点表达式切面功能执行的位置
     *   在方法的上面
     *   特点：
     *   在目标方法之前执行
     */
    @Before(value = "execution(public void com.lz.bg01.SomeServiceImpl.doSome(String))")
    public void myBefore(){
        System.out.println("Before通知");
    }
}
