package com.yyr.common.dao;

import java.util.List;

/**
 * @Author: yyr
 * @Date: 2019/5/23 13:59
 */

public interface CrudDao<T> extends  BaseDao{
     public  int  addInfo(T bean);
     public  int  updateInfo(T bean);
     public  int  deleteInfo(T bean);
     public T getInfo(Integer id);
     public List<T> getAllInfo(T bean);
}
