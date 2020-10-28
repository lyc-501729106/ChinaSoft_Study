package book.dao;

import book.entity.Book;
import book.entity.Purchase;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.List;

public interface BookDao {
    public int addBook(Book book , int purchase_id) throws SQLException, ClassNotFoundException, IOException, URISyntaxException;

    public List<Book> bookAll() throws SQLException, ClassNotFoundException, IOException, URISyntaxException;

    public int addPurchase(Purchase purchase) throws SQLException;
}
