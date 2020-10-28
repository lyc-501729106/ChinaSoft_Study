package com.etc.myshop.entity;

public class TBy {
    private int by_id;
    private String name;
    private double price;
    private String address;
    private TWarehouse tWarehouse;
    private TUser tuser;
    public TBy(){}
    public TBy(int by_id,String name,double price , String address, TWarehouse tWarehouse,TUser tuser){
        this.by_id = by_id;
        this.name = name;
        this.price = price;
        this.address = address;
        this.tWarehouse = tWarehouse;
        this.tWarehouse.gettByList().add(this);
        this.tuser = tuser;
        this.tuser.gettByList().add(this);
    }
    public int getBy_id() {
        return by_id;
    }

    public void setBy_id(int by_id) {
        this.by_id = by_id;
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

    public TWarehouse gettWarehouse() {
        return tWarehouse;
    }

    public void settWarehouse(TWarehouse tWarehouse) {
        this.tWarehouse = tWarehouse;
    }

    public TUser getTuser() {
        return tuser;
    }

    public void setTuser(TUser tuser) {
        this.tuser = tuser;
    }
}
