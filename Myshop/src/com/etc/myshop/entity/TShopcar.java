package com.etc.myshop.entity;

public class TShopcar {
    private int sid;
    private TWarehouse twarehouse;
    private TUser tUser;
    public TShopcar(){}
    public TShopcar(int sid,TWarehouse twarehouse,TUser tUser){
        this.sid = sid;
        this.twarehouse = twarehouse;
        this.twarehouse.gettShopcarList().add(this);
        this.tUser = tUser;
        this.tUser.gettShopcarList().add(this);

    }
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public TWarehouse getTwarehouse() {
        return twarehouse;
    }

    public void setTwarehouse(TWarehouse twarehouse) {
        this.twarehouse = twarehouse;
    }

    public TUser gettUser() {
        return tUser;
    }

    public void settUser(TUser tUser) {
        this.tUser = tUser;
    }
}
