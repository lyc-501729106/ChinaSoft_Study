package mystudentsystem.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private String uname ;
    private String pwd ;
    private String name ;
    private String newname ;

    public String getNewname() {
        return newname;
    }
    public void setNewname(String newname) {
        this.newname = newname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Student(){

    }
    public Student(String name){
        this.name = name ;
    }
    public Student(String uname , String pwd){
        this.uname = uname ;
        this.pwd = pwd ;
    }

    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    @Override
    public String toString() {
        return "Student{" +
                "uname='" + uname + '\'' +
                ", pwd=" + pwd +
                ", name='" + name + '\'' +
                ", newname='" + newname + '\'' +
                '}';
    }
}
