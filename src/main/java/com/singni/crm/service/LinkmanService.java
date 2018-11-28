package com.singni.crm.service;

import com.singni.crm.domain.Linkman;
import com.singni.crm.domain.PageIndex;

public interface LinkmanService {


    public void saveLinkMan(Linkman linkman);

    public PageIndex findLinkManByList(int index,int rows );
}
