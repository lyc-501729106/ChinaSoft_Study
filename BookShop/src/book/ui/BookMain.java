package book.ui;

import book.entity.Book;
import book.entity.Purchase;
import book.service.BookService;
import book.serviceImpl.BookServiceImpl;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BookMain {
    /**
     * 上架书的功能
     */
    public void addBook() throws SQLException {
        Purchase purchase = new Purchase("三国演义",45.6,"新中书店",new Date() ,"施耐庵" , 100 , "新华出版社" , "四大名著");
        Book book = new Book(purchase , purchase.getName(),purchase.getAuthor() ,purchase.getNum(),purchase.getPrice(),purchase.getPress(),new Date(),purchase.getInfo(),"","");
//        Book book = new Book(purchase);
        BookService bs = new BookServiceImpl();
        int no = bs.addBook(purchase);
        if (no > 0) System.out.println("上架成功！");
        else System.out.println("上架失败！");
    }
    /**
     * 查询所有图书信息的功能
     */
    public void bookAll() throws SQLException, ClassNotFoundException, IOException, URISyntaxException {
        BookService bs = new BookServiceImpl() ;
        List<Book> list = bs.bookAll() ;
        if (list.size() > 0 ){
            for (int i = 0; i < list.size(); i++) {
                Book book = list.get(i) ;
                if (book != null)
                System.out.println(
                        "序号:" +
                                book.getBook_id() + " " +
                                "书名:" +
                                book.getBookname() + " " +
                                "作者:" +
                                book.getAuthor() + " " +
                                "价钱:" +
                                book.getPrice() + " " +
                                "数量:" +
                                book.getNum() + " " +
                                "出版社:" +
                                book.getPress());
            }
        }
    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException, URISyntaxException {
        BookMain book = new BookMain() ;
        book.bookAll();
//        book.addBook();

    }
}
