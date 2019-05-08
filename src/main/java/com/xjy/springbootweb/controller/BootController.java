package com.xjy.springbootweb.controller;

import com.xjy.springbootweb.Entity.Products;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class BootController {

    @ResponseBody
    @RequestMapping("/bootcontroller")
    public String bootController(){
        return "hello spring boot controller";
    }


    @RequestMapping("/welcome")
    public String thymeleafTest(Map<String,Object> thymeleafMap){
        thymeleafMap.put("th_id_01","thymeleaf_id");
        thymeleafMap.put("th_class_01","thymeleaf_class");
        thymeleafMap.put("th_text_01","thymeleaf_text");

        List<Products> prods = new ArrayList<>();
        prods.add(new Products("apple",10,100));
        prods.add(new Products("banana",20,200));
        prods.add(new Products("orange",30,300));
        thymeleafMap.put("prods",prods);
        return "thymeleaf01"; //跳转到templates下的thymeleaf01.html
    }
}
