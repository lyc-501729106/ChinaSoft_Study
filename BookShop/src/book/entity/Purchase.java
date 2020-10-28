package book.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Purchase {
    private int purchase_id ;
    private String name;
    private double price;
    private String address;
    private Date enterday;
    private String author;
    private int num;
    private String press;
    private String info;
    private List<Book> bookList;
    public Purchase(){
        bookList = new ArrayList<>();
    }
    public Purchase(String name , double price , String address , Date enterday , String author , int num ,String press , String info){
        this.name = name ;
        this.price = price ;
        this.address = address;
        this.enterday = enterday;
        this.author = author;
        this.num =num;
        this.press = press;
        this.info = info;
        bookList = new ArrayList<>();
    }
    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public int getPurchase_id() {
        return purchase_id;
    }

    public void setPurchase_id(int purchase_id) {
        this.purchase_id = purchase_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getEnterday() {
        return enterday;
    }

    public void setEnterday(Date enterday) {
        this.enterday = enterday;
    }
}
