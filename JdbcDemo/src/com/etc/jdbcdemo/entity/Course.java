package com.etc.jdbcdemo.entity;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int course_id ;
    private String cname ;
    //一门课程对应多个成绩
    private List<Score> scoreList ;
    public Course(){
        scoreList = new ArrayList<>();
    }
    public Course(String cname){
        this.cname = cname;
        scoreList = new ArrayList<>();
    }
    public List<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<Score> scoreList) {
        this.scoreList = scoreList;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
