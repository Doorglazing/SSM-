package com.neuedu.controller;

import com.neuedu.domain.Account;
import com.neuedu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> all = accountService.findAll();
        System.out.println(all.get(0).getMoney());
        model.addAttribute("lists", all);
        return "list";
    }
    @RequestMapping("/insert")
    private String insert(Account account, HttpServletRequest request, HttpServletResponse response){
        accountService.insertInto(account);
        return "redirect:/account/findAll";
    }
}
