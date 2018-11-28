package com.singni.crm.controller;

import com.alibaba.fastjson.JSONObject;
import com.singni.crm.domain.Linkman;
import com.singni.crm.domain.PageIndex;
import com.singni.crm.service.LinkmanService;
import com.singni.crm.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LinkmanController {
    @Autowired
    private LinkmanService linkmanService;


    @RequestMapping("/linkman/save")
    public String saveLinkman(Linkman linkman){
        linkmanService.saveLinkMan(linkman);
        return "/linkman/list";
    }
    @RequestMapping("/linkman/findLinkmanBylist")
    @ResponseBody
    public String findLinkmanByList(String Search, String order, @RequestParam(required=true,defaultValue="0")int offset ,@RequestParam(required=true,defaultValue="10") int limit){

        PageIndex byList = linkmanService.findLinkManByList(offset, limit);
        return JSONObject.toJSONString(byList);
    }

}
