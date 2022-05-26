package com.hziee.hotel.Utils;

import java.util.List;

public class Page<T> {

    private List<T> list;
    private int pageNum; //当前页码
    private int pageSize;//每页数量
    private int pageCount;//总页数

    public List<T> getList() {
        return list;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}