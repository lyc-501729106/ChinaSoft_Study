package com.etc.flower.entity;

import java.util.ArrayList;
import java.util.List;

public class Tuser {
    private int tuserid;
    private String uname;
    private String role;
    private double money;
    private int age;
    private String pwd;
    private List<ShopCar> shopCarList;
    private List<Forder> forderList;
    private List<Address> addressList;
    public Tuser(){
        this.shopCarList = new ArrayList<>();
        this.forderList = new ArrayList<>();
        this.addressList = new ArrayList<>();
    }
    public Tuser(int tuserid , String uname , double money , int age){
        this.tuserid = tuserid;
        this.uname = uname;
        this.money = money;
        this.age = age;
        this.shopCarList = new ArrayList<>();
        this.forderList = new ArrayList<>();
        this.addressList = new ArrayList<>();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getTuserid() {
        return tuserid;
    }

    public void setTuserid(int tuserid) {
        this.tuserid = tuserid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<ShopCar> getShopCarList() {
        return shopCarList;
    }

    public void setShopCarList(List<ShopCar> shopCarList) {
        this.shopCarList = shopCarList;
    }

    public List<Forder> getForderList() {
        return forderList;
    }

    public void setForderList(List<Forder> forderList) {
        this.forderList = forderList;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
}
