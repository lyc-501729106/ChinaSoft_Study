package book.entity;

import java.util.Date;

public class Return {
    private int return_id;
    private String name;
    private Date enterday;
    private User user;
    private Book book;
    public Return(){}
    public Return(User user , Book book){
        this.user = user;
        this.book = book;
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getReturn_id() {
        return return_id;
    }

    public void setReturn_id(int return_id) {
        this.return_id = return_id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnterday() {
        return enterday;
    }

    public void setEnterday(Date enterday) {
        this.enterday = enterday;
    }
}
