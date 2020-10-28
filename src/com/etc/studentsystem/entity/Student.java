package com.etc.studentsystem.entity;

import java.util.Objects;

public class Student {
   /* String [] names = {"李林" , "王丽" , "刘莹" , "日其愣"};
    int [] ages = {20 , 18 , 19 , 18} ;
    String [] address = {"呼伦贝尔" , "北京", "上海" , "呼大"};*/

    private String name ;
    private int age ;
    private long phone ;
    private int pwd ;
  public Student(String name , int pwd){
      this.name = name ;
      this.pwd = pwd ;
  }
    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    //取值
    public String getName() {
        return name;
    }
    //存值
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public Student(String name, int age, long phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
   public Student(){

   }

    @Override
    public String toString() {
     /*   return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';*/
     return "学生姓名：" + name ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                phone == student.phone &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, phone);
    }
}
