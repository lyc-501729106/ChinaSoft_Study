package com.etc.flower.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Forder {
    private int oid;
    private Tuser tuser;
    private double sum;
    private int page;
    private Date orderdate;
    private List<Odetail> odetailList;
    public Forder(){
        odetailList = new ArrayList<>();
    }
    public Forder(int oid , Tuser tuser , double sum , Date orderdate){
        odetailList = new ArrayList<>();
        this.oid = oid;
        this.tuser = tuser;
        this.sum = sum;
        this.orderdate = orderdate;
        this.tuser.getForderList().add(this);
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public Tuser getTuser() {
        return tuser;
    }

    public void setTuser(Tuser tuser) {
        this.tuser = tuser;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public List<Odetail> getOdetailList() {
        return odetailList;
    }

    public void setOdetailList(List<Odetail> odetailList) {
        this.odetailList = odetailList;
    }
}
