package com.etc.myshop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TWarehouse {
    private int product_id;
    private String name;
    private Date enterday;
    private String info;
    private double price;
    private int num;
    private String pic;
    private String spic;
    private TPurchase tPurchase;
    private List<Detail> detailList;
    private List<TUser> tUserList;
    private List<TBy> tByList;
    private List<TShopcar> tShopcarList;
    public TWarehouse(){
        this.tUserList = new ArrayList<>();
        this.tShopcarList = new ArrayList<>();
        this.tByList = new ArrayList<>();
        this.detailList = new ArrayList<>();
    }
    public TWarehouse(int product_id,String name, Date enterday,String info,double price , int num, TPurchase tPurchase){
        this.tUserList = new ArrayList<>();
        this.tShopcarList = new ArrayList<>();
        this.tByList = new ArrayList<>();
        this.detailList = new ArrayList<>();
        this.product_id = product_id;
        this.name = name;
        this.enterday = enterday;
        this.info = info;
        this.price = price;
        this.num = num;
        this.tPurchase = tPurchase;
        this.tPurchase.gettWarehouseList().add(this);
    }

    public String getSpic() {
        return spic;
    }

    public void setSpic(String spic) {
        this.spic = spic;
    }

    public List<Detail> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<Detail> detailList) {
        this.detailList = detailList;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnterday() {
        return enterday;
    }

    public void setEnterday(Date enterday) {
        this.enterday = enterday;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public TPurchase gettPurchase() {
        return tPurchase;
    }

    public void settPurchase(TPurchase tPurchase) {
        this.tPurchase = tPurchase;
    }

    public List<TUser> gettUserList() {
        return tUserList;
    }

    public void settUserList(List<TUser> tUserList) {
        this.tUserList = tUserList;
    }

    public List<TBy> gettByList() {
        return tByList;
    }

    public void settByList(List<TBy> tByList) {
        this.tByList = tByList;
    }

    public List<TShopcar> gettShopcarList() {
        return tShopcarList;
    }

    public void settShopcarList(List<TShopcar> tShopcarList) {
        this.tShopcarList = tShopcarList;
    }
}
