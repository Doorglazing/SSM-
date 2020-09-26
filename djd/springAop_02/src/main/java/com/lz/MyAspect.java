package com.lz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

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

    @Before(value = "execution(public void com.lz.SomeServiceImpl.doSome(String))")
    public void myBefore(JoinPoint jp){
        System.out.println(jp.getSignature());
        System.out.println(jp.getSignature().getName());
        System.out.println("Before通知");
    }
    /**
     *  后置通知定义方法：方法是实现切面功能的。
     *  方法的定义要求：
     *  1.公共方法 public
     *  2.方法有返回值
     *  3.方法名称自定义
     *  4.方法有参数的，推荐是Object ，参数名自定义
     * @AfterReturning ： 后置通知
     *     属性：1.value 切入点表达式
     *          2.returning 自定义的变量，表示目标方法的返回值的。
     *          自定以变量名必须何通知方法的形参名一样
     *     位置：在方法定义的上面
     *     特点：
     *          1.在目标方法之后执行的。
     *          2.能够获取到目标方法的返回值，可以根据这个返回值做不同的处理功能
     *          3.可以修改这个返回值
     */
    //    res要相同
    @AfterReturning(value = "execution(public String com.lz.SomeServiceImpl.dothre(..))", returning = "res")
    public void myAfterReturn(Object res){
        System.out.println("后置通知获取的返回值 "+ res);
    }

    /**
     *  环绕通知：
     *      1.public
     *      2.需要返回值
     *      3.方法名自定义
     *      4.方法有参数，固定的参数 ProceedingJoinPoint
     *
     */
    /**
     * @Around :
     *      属性： value 切入点表达式
     *      位置：在方法的定义什么
     *    特点：
     *      1.它是功能最强的通知
     *      2.在目标方法的前和后都能增强功能
     *      3.控制目标方法知否被调用执行
     *      4.修改原来的目标方法的执行结果。 影响最后的调用结果
     *    环绕通知，等同于动态代理 ： InvocationHandler
     *    ProceedingJoinPoin 等同于 method 执行目标方法
     *    返回值： 就是目标方法的结果可以被修改
     */

    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("修改东西");
        Object proceed = proceedingJoinPoint.proceed(); // 相当于 doFirst();
        System.out.println("提交事物");
        return proceed;
    }

    @AfterThrowing(value = "execution(* *..SomeServiceImpl.doFirst())", throwing = "e")
    public void myAfterThrowing(Exception e){
        System.out.println(e.getStackTrace());
    }

    @After(value = "execution(* *..SomeServiceImpl.diFirst())")
    public void myAfter(){
        System.out.println("最终通知");
    }

}
