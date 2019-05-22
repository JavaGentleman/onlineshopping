package com.yyr.modules.category.service;

import com.alibaba.druid.filter.AutoLoad;
import com.yyr.modules.category.dao.CategoryDao;
import com.yyr.modules.category.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    public List<Category> findCategorys(Category category) {
        return categoryDao.findCategorys(category);
    }
}
