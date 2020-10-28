package book.daoImpl;

import book.dao.BookDao;
import book.entity.Book;
import book.entity.Purchase;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl extends BaseDao implements BookDao {
    @Override
    public int addBook(Book book , int purchase_id) throws SQLException, ClassNotFoundException, IOException, URISyntaxException {
        String sql = "insert into tbook (purchase_id , bookname , author , enterday , press ,info , price , num ) values (?,?,?,NOW(),?,?,?,?) ;" ;
        ps = con.prepareStatement(sql) ;
//        int purchase_id = getMaxPurchase_id();
        ps.setInt(1,purchase_id);  //进货订单
        ps.setString(2,book.getBookname()); //书名
        ps.setString(3,book.getAuthor()); //作者
        ps.setString(4,book.getPress()); //出版社
        ps.setString(5,book.getInfo()); //介绍
        ps.setDouble(6,book.getPrice()); //价格
        ps.setInt(7,book.getNum()); //库存
        return ps.executeUpdate() ;
    }
    @Override
    public int addPurchase(Purchase purchase) throws SQLException {
        String sql = "insert into tpurchase (name , price ,address,enterday,author,num,press,info) values (?,?,?,NOW(),?,?,?,?);" ;
        ps = con.prepareStatement(sql);
        ps.setString(1,purchase.getName());
        ps.setDouble(2,purchase.getPrice());
        ps.setString(3,purchase.getAddress());
        ps.setString(4,purchase.getAuthor());
        ps.setInt(5,purchase.getNum());
        ps.setString(6,purchase.getPress());
        ps.setString(7,purchase.getInfo());
        int no = ps.executeUpdate();
        return no;
    }
    public int getMaxPurchase_id() throws SQLException, URISyntaxException, IOException, ClassNotFoundException {
        String sql = "select MAX(purchase_id) from tpurchase ;";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        int cid = 3;
        if (rs.next()){
            cid = rs.getInt(1);
            System.out.println(cid + "个进货订单");
        }
        return cid;
    }

    @Override
    public List<Book> bookAll() throws SQLException, ClassNotFoundException, IOException, URISyntaxException {
        openDb();
        String sql = "select * from tbook ;" ;
        ps = con.prepareStatement(sql) ;
        rs = ps.executeQuery() ;
        Book book = null ;
        List<Book> list = new ArrayList<>();
        while (rs.next()){
            book = new Book() ;
            book.setBook_id(rs.getInt("book_id"));
            book.setBookname(rs.getString("bookname"));
            book.setAuthor(rs.getString("author"));
            book.setNum(rs.getInt("num"));
            book.setPress(rs.getString("press"));
            book.setPrice(rs.getDouble("price"));
            list.add(book) ;
        }
        return list;
    }


}
