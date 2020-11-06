package com.etc.mybatis.entity;

/**
 * @Author 吕译辰
 * @Date 2020/11/2 - 14:49
 */
public class Tuser {
    private String uname;
    private int age;
    private int tid;
    private int tuserid;

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

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tuser{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                '}';
    }

}
