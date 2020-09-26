package com.lz.controller;


import com.lz.domain.Goods01;
import com.lz.service.BuyGoodsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

public class Control extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String amount = req.getParameter("amount");
        String price = req.getParameter("price");

        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        BuyGoodsService service = (BuyGoodsService) ac.getBean("buyService");
        Goods01 goods01 = new Goods01();
        goods01.setId(Integer.parseInt(id));
        goods01.setAmount(Integer.parseInt(amount));
        goods01.setName(name);
        goods01.setPrice(Integer.parseInt(price));
        service.insertInto(goods01);
        req.getRequestDispatcher("/success.jsp").forward(req, resp);
    }
}
