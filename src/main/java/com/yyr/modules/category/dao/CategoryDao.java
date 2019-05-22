package com.yyr.modules.category.dao;

import com.yyr.common.annotation.MyBatisDao;
import com.yyr.modules.category.entity.Category;

import java.util.List;

@MyBatisDao
public interface CategoryDao {
    
    List<Category> findCategorys(Category category);
}
