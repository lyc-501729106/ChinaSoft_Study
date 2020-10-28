package com.etc.jdbcdemo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Studentnew {
    private int stu_id ;
    private Tclass tclass; //表现多对一的关系的时候，需要使用类属性的方式来实现
    private List<Room_Student> room_studentList ;
    private List<Score> scoreList ;
    private String sname ;
    private int age ;
    private Date enterday ;
    private double score ;
    public Studentnew(){
        room_studentList = new ArrayList<>();
        scoreList = new ArrayList<>();
    }
    public Studentnew(Tclass tclass, String sname , int age , Date enterday , double score){
        this.tclass = tclass;
        this.sname = sname;
        this.age = age ;
        this.enterday = enterday;
        this.score = score ;
        //创建当前实例的时候将自己添加到班级的集合中
        this.tclass.getStudentnewList().add(this);
        room_studentList = new ArrayList<>();
        scoreList = new ArrayList<>();
    }

    public Tclass getTclass() {
        return tclass;
    }

    public void setTclass(Tclass tclass) {
        this.tclass = tclass;
    }

    public List<Room_Student> getRoom_studentList() {
        return room_studentList;
    }

    public void setRoom_studentList(List<Room_Student> room_studentList) {
        this.room_studentList = room_studentList;
    }

    public List<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<Score> scoreList) {
        this.scoreList = scoreList;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getEnterday() {
        return enterday;
    }

    public void setEnterday(Date enterday) {
        this.enterday = enterday;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
