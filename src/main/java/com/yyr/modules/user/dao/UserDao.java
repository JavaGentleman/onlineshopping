package com.yyr.modules.user.dao;

import com.yyr.common.annotation.MyBatisDao;
import com.yyr.common.dao.CrudDao;
import com.yyr.modules.user.entity.User;

/**
 * @Author: yyr
 * @Date: 2019/5/23 14:09
 */
@MyBatisDao
public interface UserDao extends CrudDao<User> {
    /**
     * 登录验证
     * @param user
     * @return
     */
    public User getUser(User user);

}
