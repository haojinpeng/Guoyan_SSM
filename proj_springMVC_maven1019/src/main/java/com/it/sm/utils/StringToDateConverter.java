package com.it.sm.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//转换器，字符串到日期类型
public class StringToDateConverter implements Converter<String, Date> {
    //用于把 String 类型转成日期类型
    @Override
    public Date convert(String source) {
        DateFormat format = null;
        if (source == null){
            throw new NullPointerException("请输入要转换的日期");
        }
        format = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date date = format.parse(source);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


}
