package com.etc.xml0915.entity;

import java.util.ArrayList;
import java.util.List;

public class School {
    private int id ;
    private String name;
    private List<Tclass> tclassList;
    public School(){
        //创建学校实例的时候，创建班级的实例
        tclassList = new ArrayList<Tclass>();
    }
    public School(int id , String name){
        this.id = id;
        this.name = name;
        //创建学校实例的时候，创建班级的实例。
        tclassList = new ArrayList<Tclass>();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tclass> getTclassList() {
        return tclassList;
    }

    public void setTclassList(List<Tclass> tclassList) {
        this.tclassList = tclassList;
    }
}
