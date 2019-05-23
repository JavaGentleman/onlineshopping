package com.yyr.modules.user.service;

import com.yyr.modules.user.dao.UserDao;
import com.yyr.modules.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: yyr
 * @Date: 2019/5/23 14:39
 */
@Service
public class UserService {

    @Autowired
    private  UserDao userDao;

    public User getUser(User user){
        return  userDao.getUser(user);

    }
}
