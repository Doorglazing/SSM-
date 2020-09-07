package com.neuedu.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConveter implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        if(s==null||"".equals(s)){
            throw new RuntimeException("格式不正确");
        }
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");

        try {
            return sd.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
