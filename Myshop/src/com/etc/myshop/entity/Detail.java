package com.etc.myshop.entity;

public class Detail {
    private int detail_id;
    private TWarehouse tWarehouse;
    private String pic;
    private String info;
    private double price;

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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getDetail_id() {
        return detail_id;
    }

    public void setDetail_id(int detail_id) {
        this.detail_id = detail_id;
    }

    public TWarehouse gettWarehouse() {
        return tWarehouse;
    }

    public void settWarehouse(TWarehouse tWarehouse) {
        this.tWarehouse = tWarehouse;
    }
}
