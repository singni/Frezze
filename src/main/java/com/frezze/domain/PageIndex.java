package com.frezze.domain;

import java.util.List;

/**
 * Created by Rian on 2018/11/27.
 * Copyright © 2018 Rian. All rights reserved
 */
public class PageIndex {
    private long total;

    private List<?> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }


    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
