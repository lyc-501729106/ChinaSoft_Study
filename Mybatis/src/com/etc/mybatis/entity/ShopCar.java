package com.etc.mybatis.entity;



public class ShopCar {
    private int sid;
    private Tuser tuser;
    private Flower flower;
    // f.flowername flowername,f.price price,f.fid fid, f.count count,f.pic pic,s.sid sid
    private String flowername;
    private double price;
    private double price1;
    private int fid;
    private int count;
    private String pic;
    public ShopCar(){
    }
    public ShopCar(int sid , Tuser tuser, Flower flower){
        this.sid = sid;
        this.tuser = tuser;
        this.flower = flower;
        this.flower.getShopCarList().add(this);
    }

    public double getPrice1() {
        return price1;
    }

    public void setPrice1(double price1) {
        this.price1 = price1;
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

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
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

    @Override
    public String toString() {
        return "ShopCar{" +
                "sid=" + sid +
                ", tuser=" + tuser +
                ", flower=" + flower +
                ", flowername='" + flowername + '\'' +
                ", price=" + price +
                ", price1=" + price1 +
                ", fid=" + fid +
                ", count=" + count +
                ", pic='" + pic + '\'' +
                '}';
    }
}
