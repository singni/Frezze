package com.frezze.domain;

/**
 * Created by Rian on 2018/12/17.
 * Copyright © 2018 Rian. All rights reserved
 */
public class DeptAndParent extends DeptP{
  private   String pname;
  private String pid;
  private int pstate;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public int getPstate() {
        return pstate;
    }

    public void setPstate(int pstate) {
        this.pstate = pstate;
    }
}
