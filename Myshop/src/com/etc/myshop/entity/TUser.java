package com.etc.myshop.entity;

import java.util.ArrayList;
import java.util.List;

public class TUser {
    private int tuser_id;
    private String uname;
    private String pwd;
    private String tel;
    private int role;
    private int product_id;
    private TWarehouse tWarehouse;
    private List<TBy> tByList;
    private List<TAddress> tAddressList;
    private List<TShopcar> tShopcarList;
    public TUser(){
        this.tByList = new ArrayList<>();
        this.tAddressList = new ArrayList<>();
        this.tShopcarList = new ArrayList<>();
    }
    public TUser(int tuser_id,String uname,String pwd, String tel , int role,TWarehouse tWarehouse ){
        this.tuser_id = tuser_id;
        this.uname = uname;
        this.pwd = pwd;
        this.tel = tel;
        this.role = role;
        this.tWarehouse = tWarehouse;
        this.tWarehouse.gettUserList().add(this);
        this.tByList = new ArrayList<>();
        this.tAddressList = new ArrayList<>();
        this.tShopcarList = new ArrayList<>();
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getTuser_id() {
        return tuser_id;
    }

    public void setTuser_id(int tuser_id) {
        this.tuser_id = tuser_id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public TWarehouse gettWarehouse() {
        return tWarehouse;
    }

    public void settWarehouse(TWarehouse tWarehouse) {
        this.tWarehouse = tWarehouse;
    }

    public List<TBy> gettByList() {
        return tByList;
    }

    public void settByList(List<TBy> tByList) {
        this.tByList = tByList;
    }

    public List<TAddress> gettAddressList() {
        return tAddressList;
    }

    public void settAddressList(List<TAddress> tAddressList) {
        this.tAddressList = tAddressList;
    }

    public List<TShopcar> gettShopcarList() {
        return tShopcarList;
    }

    public void settShopcarList(List<TShopcar> tShopcarList) {
        this.tShopcarList = tShopcarList;
    }
}
