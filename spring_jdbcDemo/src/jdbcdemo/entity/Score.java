package jdbcdemo.entity;

public class Score {
    private int sc_id;
    private Studentnew studentnew ;
    private Course course ;
    private double stuscore ;
    public Score(){}
    public Score(Studentnew studentnew , Course course){
        this.studentnew = studentnew;
        this.course = course;
    }
    public Studentnew getStudentnew() {
        return studentnew;
    }

    public void setStudentnew(Studentnew studentnew) {
        this.studentnew = studentnew;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getSc_id() {
        return sc_id;
    }

    public void setSc_id(int sc_id) {
        this.sc_id = sc_id;
    }


    public double getStuscore() {
        return stuscore;
    }

    public void setStuscore(double stuscore) {
        this.stuscore = stuscore;
    }
}
