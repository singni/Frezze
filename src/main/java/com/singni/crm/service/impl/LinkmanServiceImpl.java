package com.singni.crm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.singni.crm.domain.*;
import com.singni.crm.mapper.LinkmanMapper;
import com.singni.crm.service.LinkmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LinkmanServiceImpl implements LinkmanService {
    @Autowired
    private LinkmanMapper linkmanMapper;

    public void saveLinkMan(Linkman linkman) {
        linkman.setId(UUID.randomUUID().toString());
        linkmanMapper.insert(linkman);
    }

    public PageIndex findLinkManByList(int index, int rows) {
        PageHelper.offsetPage(index,rows);

        LinkmanExample exam=new LinkmanExample();
        List<Linkman> linkman = linkmanMapper.selectByExample(exam);
        PageInfo pageInfo=new PageInfo(linkman);
        long total = pageInfo.getTotal();
        PageIndex pageIndex=new PageIndex();
        pageIndex.setTotal(total);
        pageIndex.setRows(linkman);
        return pageIndex;
    }
}
