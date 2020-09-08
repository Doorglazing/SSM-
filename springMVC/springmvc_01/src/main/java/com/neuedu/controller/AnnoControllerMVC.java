package com.neuedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping(path = "/anno")
public class AnnoControllerMVC {
    @RequestMapping(path = "/annoCon")
//    ?name = haha
    public String annoCon(@RequestParam(name="name") String username){
        System.out.println("haha");
        return "success";
    }
//    username=sa&age=23
    @RequestMapping("/annoTest")
    public String annoTest(@RequestBody String body){
        System.out.println(body);
        return "success";
    }
    @RequestMapping("/annoTest1/{name}")
    public String annoTest1(@PathVariable(name="name") String username){
        return "success";
    }
}
