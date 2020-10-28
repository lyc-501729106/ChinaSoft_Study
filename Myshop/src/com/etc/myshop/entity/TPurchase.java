package com.etc.myshop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TPurchase {
    private int purchase_id;
    private String name;
    private double price;
    private String address;
    private Date enterday;
    private List<TWarehouse> tWarehouseList;
    public TPurchase(){
        this.tWarehouseList = new ArrayList<>();
    }
    public TPurchase(int purchase_id,String name,double price,String address, Date enterday){
        this.purchase_id = purchase_id;
        this.name = name;
        this.price = price;
        this.address = address;
        this.enterday = enterday;
        this.tWarehouseList = new ArrayList<>();
    }

    public int getPurchase_id() {
        return purchase_id;
    }

    public void setPurchase_id(int purchase_id) {
        this.purchase_id = purchase_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getEnterday() {
        return enterday;
    }

    public void setEnterday(Date enterday) {
        this.enterday = enterday;
    }

    public List<TWarehouse> gettWarehouseList() {
        return tWarehouseList;
    }

    public void settWarehouseList(List<TWarehouse> tWarehouseList) {
        this.tWarehouseList = tWarehouseList;
    }
}
