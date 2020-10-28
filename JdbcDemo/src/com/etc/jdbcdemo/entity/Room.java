package com.etc.jdbcdemo.entity;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int r_id ;
    private String rname ;
    //Room与Room_Student之间为一对多，所以可以使用集合来表示
    private List<Room_Student> room_studentList ;
    public Room(){
        room_studentList = new ArrayList<>() ;
    }
    public Room(String rname){
        this.rname = rname ;
        room_studentList = new ArrayList<>() ;
    }
    public List<Room_Student> getRoom_studentList() {
        return room_studentList;
    }

    public void setRoom_studentList(List<Room_Student> room_studentList) {
        this.room_studentList = room_studentList;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }
}
