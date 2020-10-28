package com.etc.flower.entity;

public class ShopCar {
    private int sid;
    private Tuser tuser;
    private Flower flower;
    public ShopCar(){
    }
    public ShopCar(int sid , Tuser tuser, Flower flower){
        this.sid = sid;
        this.tuser = tuser;
        this.flower = flower;
        this.tuser.getShopCarList().add(this);
        this.flower.getShopCarList().add(this);
    }
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public Tuser getTuser() {
        return tuser;
    }

    public void setTuser(Tuser tuser) {
        this.tuser = tuser;
    }

    public Flower getFlower() {
        return flower;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }
}
