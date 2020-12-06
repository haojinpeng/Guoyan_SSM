package com.it.springmvc.controller;

import com.it.springmvc.pojo.Item;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Component
@Controller
public class ItemController {
    @RequestMapping(value = "itemList")
    public ModelAndView itemList(){
        //创建对象
        ModelAndView andView = new ModelAndView();
        //给前端传值
        List<Item> itemList = new ArrayList<Item>();
        itemList.add(new Item(1, "冰箱", 1999.0, new Date(), "质量不错"));
        itemList.add(new Item(2, "冰箱2", 1999.0, new Date(), "质量不错2"));
        itemList.add(new Item(3, "冰箱3", 1999.0, new Date(), "质量不错3"));
        itemList.add(new Item(4, "冰箱4", 1999.0, new Date(), "质量不错4"));
        itemList.add(new Item(5, "冰箱5", 1999.0, new Date(), "质量不错5"));
        andView.addObject("itemList",itemList);
        //给前端传递路径
        andView.setViewName("/WEB-INF/item/itemList.jsp");
        return andView;
    }
}
