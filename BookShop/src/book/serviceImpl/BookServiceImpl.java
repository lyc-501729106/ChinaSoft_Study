package book.serviceImpl;

import book.dao.BookDao;
import book.daoImpl.BookDaoImpl;
import book.entity.Book;
import book.entity.Purchase;
import book.service.BookService;
import book.util.Log;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {


    @Override
    public int addBook(Purchase purchase) throws SQLException {
        BookDao dao = new BookDaoImpl();
        int no = 0 ;
        try {
            //打开事务
            ((BookDaoImpl)dao).openTransaction();
            //添加进货订单
            dao.addPurchase(purchase);
            //上架图书
            List<Book> bookList = purchase.getBookList();
            int purchase_id = ((BookDaoImpl) dao).getMaxPurchase_id();
            for (Book book :
                    bookList) {
                System.out.println(book.getBookname());
                no = dao.addBook(book,purchase_id);
            }
            //提交事务
            ((BookDaoImpl)dao).commitTransaction();
        } catch (Exception e) {
            //回滚事务
            ((BookDaoImpl)dao).rollbackTransaction();
            Log.mylog.debug("图书上架失败！" + e.getMessage());
            e.printStackTrace();
        } finally {
            //关闭资源
            ((BookDaoImpl)dao).closeResource();
        }
        return no;
    }

    @Override
    public List<Book> bookAll() throws SQLException, ClassNotFoundException, IOException, URISyntaxException {
        BookDao dao = new BookDaoImpl() ;
        List<Book> list = new ArrayList<>();
        try {
            list = dao.bookAll() ;
        } catch (SQLException e) {
            Log.mylog.debug(e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            Log.mylog.debug(e.getMessage());
            e.printStackTrace();
        } finally {
            ((BookDaoImpl)dao).closeResource();
        }
        return list;
    }
}
