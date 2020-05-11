package com.spring.you.service;

import com.spring.you.dao.UserDao;
import com.spring.you.dao.UserDaoImpl;
import com.spring.you.dao.UserMySqlDaoImpl;
import com.spring.you.dao.UserOracleDaoImpl;

public class UserServiceImpl implements UserService {

    /**
     * 1.0 每次修改需求都需要修改原有代码
     *
     * 程序控制对象
     */
    //private UserDao userDao = new UserDaoImpl();
    //private UserDao userDao = new UserMySqlDaoImpl();
    //private UserDao userDao = new UserOracleDaoImpl();

    /**
     * 2.0 做成接口，转换调用方式，用户需要什么就set什么
     *
     * 用户控制对象
     *
     */
    private UserDao userDao;

    /**
     * 利用set实现动态值的注入
     * @param userDao
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
