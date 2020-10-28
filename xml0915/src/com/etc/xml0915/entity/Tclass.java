package com.etc.xml0915.entity;

import java.util.ArrayList;
import java.util.List;

public class Tclass {
    private String name;
    private int id;
    private School school;
    private List<Student> studentList;
    public Tclass(){
        studentList = new ArrayList<Student>();
    }
    public Tclass(String name , int id , School school){
        this.name = name;
        this.id = id;
        this.school = school;
        //创建班级对象的时候，将自己添加到学校的集合当中
        school.getTclassList().add(this);
        studentList = new ArrayList<Student>();

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
