package com.neuedu.controller;

import com.neuedu.domain.Account;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/user")
public class HelloSpringMvc {
    @RequestMapping(path = "/hello1")
    public String hello(){
        System.out.println("hello");
        // 跳转success.jsp
        return "success";
    }
    // 访问地址变为 .../user/hello2/username=hehe    光hello2访问不到
    @RequestMapping(path = "/hello2", params = {"username=hehe"})
    public String hello2(){
        System.out.println("hello2");
        return "success";
    }

    @RequestMapping(value = "/paramTest")
    @Scope
    public String accountTest(Account account){
        System.out.println(account);
        System.out.println(account.getLists());
        System.out.println(account.getMaps());
        return "success";
    }
}
