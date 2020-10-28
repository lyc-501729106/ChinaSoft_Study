package com.etc.studentsystem.dao;

import com.etc.studentsystem.util.JudgeNo;

public class DataDao {
    public int getNo() {
        return JudgeNo.judge() ;
    }
}
