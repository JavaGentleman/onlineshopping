package com.yyr.modules.category.web;

import com.yyr.modules.category.entity.Category;
import com.yyr.modules.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/lists")
    @ResponseBody
    public List<Category> fingCategorys(Category category){
        System.out.println("category = " + category);
        return categoryService.findCategorys(new Category());
    }
}
