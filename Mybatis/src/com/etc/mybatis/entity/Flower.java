package com.etc.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class Flower {
    private int fid;
    private String flowername;
    private double price;
    private String type;
    private String pic;
    private int count;
    private String flowerspeak;
    private List<ShopCar> shopCarList;
    public Flower (){
        shopCarList = new ArrayList<>();
    }
    public Flower(int fid , String flowername , double price , String type , int count,String pic){
        shopCarList = new ArrayList<>();
        this.fid = fid;
        this.flowername = flowername;
        this.pic = pic;
        this.price = price;
        this.type = type;
        this.count = count;
    }
    public Flower(String flowername , double price , String type , int count){
        shopCarList = new ArrayList<>();
        this.fid = fid;
        this.flowername = flowername;
        this.price = price;
        this.type = type;
        this.count = count;
    }

    public String getFlowerspeak() {
        return flowerspeak;
    }

    public void setFlowerspeak(String flowerspeak) {
        this.flowerspeak = flowerspeak;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public List<ShopCar> getShopCarList() {
        return shopCarList;
    }

    public void setShopCarList(List<ShopCar> shopCarList) {
        this.shopCarList = shopCarList;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFlowername() {
        return flowername;
    }

    public void setFlowername(String flowername) {
        this.flowername = flowername;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
