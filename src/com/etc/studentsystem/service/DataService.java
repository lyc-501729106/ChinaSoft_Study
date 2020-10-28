package com.etc.studentsystem.service;

import com.etc.studentsystem.dao.DataDao;

public class DataService {
    //得到一个数字
    public int getNo() {
        //在service中需要向dao层调用方法得到数据，所以需要先创建一个dao层的对象
        DataDao dao = new DataDao() ;
        return dao.getNo() ;
    }
}
