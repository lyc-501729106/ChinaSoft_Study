package book.entity;

import java.util.Date;

public class Lent {
    private int lent_id;
    private String name;
    private Date enterday;
    private User user;
    private Book book;
    public Lent(){}
    public Lent(User user, Book book){
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

    public int getLent_id() {
        return lent_id;
    }

    public void setLent_id(int lent_id) {
        this.lent_id = lent_id;
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
