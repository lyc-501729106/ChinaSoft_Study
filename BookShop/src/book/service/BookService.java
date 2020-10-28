package book.service;

import book.entity.Book;
import book.entity.Purchase;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.List;

public interface BookService {
    //图书上架的功能
    public int addBook(Purchase purchase ) throws SQLException;
    //查询所有图书的信息
    public List<Book> bookAll() throws SQLException, ClassNotFoundException, IOException, URISyntaxException;
}
