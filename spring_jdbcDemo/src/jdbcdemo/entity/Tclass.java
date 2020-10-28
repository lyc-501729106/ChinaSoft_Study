package jdbcdemo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tclass {
    private int tclass_id ;
    private String tclassname ;
    //一个班级对应多个学生
    private List<Studentnew> studentnewList ;
    public Tclass(){
        studentnewList = new ArrayList<>();
    }
    public Tclass(String tclassname){
        this.tclassname = tclassname ;
        studentnewList = new ArrayList<>();
    }
    public List<Studentnew> getStudentnewList() {
        return studentnewList;
    }

    public void setStudentnewList(List<Studentnew> studentnewList) {
        this.studentnewList = studentnewList;
    }

    public int getTclass_id() {
        return tclass_id;
    }

    public void setTclass_id(int tclass_id) {
        this.tclass_id = tclass_id;
    }

    public String getTclassname() {
        return tclassname;
    }

    public void setTclassname(String tclassname) {
        this.tclassname = tclassname;
    }
}
