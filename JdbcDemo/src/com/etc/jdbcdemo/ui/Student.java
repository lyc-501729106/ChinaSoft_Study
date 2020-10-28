package com.etc.jdbcdemo.ui;


public class Student {

  private int stuId;
  private int tclass;
  private String sname;
  private int age;
  private java.util.Date enterday;
  private double score;


  public int getStuId() {
    return stuId;
  }

  public void setStuId(int stuId) {
    this.stuId = stuId;
  }


  public int getTclass() {
    return tclass;
  }

  public void setTclass(int tclass) {
    this.tclass = tclass;
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


  public java.util.Date getEnterday() {
    return enterday;
  }

  public void setEnterday(java.util.Date enterday) {
    this.enterday = enterday;
  }


  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }

}
