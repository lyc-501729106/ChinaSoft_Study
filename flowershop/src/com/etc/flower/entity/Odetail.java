package com.etc.flower.entity;

public class Odetail {
    private int did;
    private int count;
    private double sum;
    private Forder forder;
    private Flower flower;
    public Odetail(){

    }
    public Odetail(int did , int count , double sum , Forder forder , Flower flower ){
        this.did = did;
        this.count = count;
        this.sum = sum;
        this.forder = forder;
        this.flower = flower;
        this.forder.getOdetailList().add(this);
        this.flower.getOdetailList().add(this);

    }
    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Forder getForder() {
        return forder;
    }

    public void setForder(Forder forder) {
        this.forder = forder;
    }

    public Flower getFlower() {
        return flower;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }
}
