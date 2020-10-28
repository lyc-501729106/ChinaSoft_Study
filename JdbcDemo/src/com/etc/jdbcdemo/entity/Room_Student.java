package com.etc.jdbcdemo.entity;

public class Room_Student {
    private int r_sid;

    private Studentnew stu ;
    private Room room ;
    public Room_Student(){

    }
    public Room_Student(Studentnew stu , Room room){
        this.stu = stu;
        this.room = room;
    }
    public Studentnew getStu() {
        return stu;
    }

    public void setStu(Studentnew stu) {
        this.stu = stu;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getR_sid() {
        return r_sid;
    }

    public void setR_sid(int r_sid) {
        this.r_sid = r_sid;
    }
}
