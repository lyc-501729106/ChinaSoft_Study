package book.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Book {
    private int book_id ;
    private String bookname ;
    private String author ;
    private int num ;
    private double price ;
    private String press ;

    private Date enterday;
    private String info;
    private String pic;//封面
    private String ISBN;
    //    private int purchase_id;
    private Purchase purchase;//表示多对一的关系的时候用类属性方式来实现
    private List<By> byList;
    private List<Return> returnList;
    private List<Lent> lentList;
    public Book(){
        byList = new ArrayList<>();
        returnList = new ArrayList<>();
        lentList = new ArrayList<>();
    }
    public Book(Purchase purchase , String bookname , String author , int num , double price , String press , Date enterday , String info , String pic , String ISBN){
        this.bookname = bookname;
        this.author = author;
        this.num = num ;
        this.price = price;
        this.press = press;
        this.enterday = enterday;
        this.info = info;
        this.pic = pic;
        this.ISBN = ISBN;
        this.purchase = purchase;
        this.purchase.getBookList().add(this);
        byList = new ArrayList<>();
        returnList = new ArrayList<>();
        lentList = new ArrayList<>();
    }
    public Book(Purchase purchase){
        this.purchase = purchase;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
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

    public Date getEnterday() {
        return enterday;
    }

    public void setEnterday(Date enterday) {
        this.enterday = enterday;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }
}
