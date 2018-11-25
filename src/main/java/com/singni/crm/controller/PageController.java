package com.singni.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/12/22.
 */
@Controller
public class PageController {
    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }


    @RequestMapping("/customer/{page}")
    public String showAddCust(@PathVariable String page){

        return "customer/"+page;
    }
}
