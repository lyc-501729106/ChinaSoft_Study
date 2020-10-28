package com.etc.myshop.entity;

public class TAddress {
    private int aid;
    private String address;
    private TUser tUser;
    public TAddress(){}
    public TAddress(int aid,String address,TUser tUser){
        this.aid = aid;
        this.address = address;
        this.tUser = tUser;
        this.tUser.gettAddressList().add(this);
    }
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public TUser gettUser() {
        return tUser;
    }

    public void settUser(TUser tUser) {
        this.tUser = tUser;
    }
}
