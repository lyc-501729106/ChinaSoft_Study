package book.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String uname_id;
    private String pwd;
    private String tel;
    private int role;
    private List<By> byList;
    private List<Return> returnList;
    private List<Lent> lentList;
    public User(){
        byList = new ArrayList<>();
        returnList = new ArrayList<>();
        lentList = new ArrayList<>();
    }
    public User(String pwd , String tel , int role ){
        this.pwd = pwd;
        this.tel = tel;
        this.role = role;
        byList = new ArrayList<>();
        returnList = new ArrayList<>();
        lentList = new ArrayList<>();
    }
    public List<By> getByList() {
        return byList;
    }

    public void setByList(List<By> byList) {
        this.byList = byList;
    }

    public List<Return> getReturnList() {
        return returnList;
    }

    public void setReturnList(List<Return> returnList) {
        this.returnList = returnList;
    }

    public List<Lent> getLentList() {
        return lentList;
    }

    public void setLentList(List<Lent> lentList) {
        this.lentList = lentList;
    }

    public String getUname_id() {
        return uname_id;
    }

    public void setUname_id(String uname_id) {
        this.uname_id = uname_id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
