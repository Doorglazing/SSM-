package com.lz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *  表示一个控制器对象
 *  位置在类上面
 *  和spring中讲的@Service, @Component一样
 */
@Controller
public class MyController {
    /**
     *  处理用户提交的请求，springmvc是用方法来处理的
     *  方法是自定义的，可以有多种返回值，多种参数， 方法名自定义
     */
    /**
     * @RequestMapping 请求映射
     *              作用： 把一个请求和一个方法绑定在一起
     *              属性： 1. value是一个String, 表示url地址的(some.do)
     *                      value 的值必须是唯一的， 不能重复. 在使用时， 推荐地时以"/"
     *              说明： 使用RequestMapping修饰的方法叫做处理器方法,或者说控制器方法。
     *              类似于servlet的doGet, doPost.
     *              返回值： ModelAndView
     *              Model：要显示给用户的数据
     *              View ： 返回jsp等.
     */
//    @RequestMapping(value = {"/some.do","/second.do"})
    @RequestMapping(value = "/some.do", method = RequestMethod.POST)
    public ModelAndView dosome(){   // doGet()
        ModelAndView mv = new ModelAndView();
//        添加数据 ， 框架最后吧数据放入request作用域
//        request.setAttribute("fun","执行完成");
        mv.addObject("msg", "欢迎使用springmvc");
        mv.addObject("fun", "执行dosmome方法");
        // 指定视图
        // 框架对视图执行的是forward.
//        mv.setViewName("/WEB-INF/view/show.jsp");
//        配置了视图解析器后用逻辑名称指定视图
//        框架自动把前缀和逻辑名称和视图进行字符串拼接

        mv.setViewName("show");
        return mv;
    }
}
