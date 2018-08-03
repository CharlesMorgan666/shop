package com.mcl.shop.service;

import com.mcl.shop.pojo.Category;
import com.mcl.shop.pojo.CategoryExample;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 莫昌廉
 */
@Service("CateService")
public interface ICateService {
    public List<Category> selectByExample(CategoryExample example);
    public void insertSelective(Category category);

    public List<Category> selectByExampleLimit(CategoryExample digCategoryExample);

    public Category selectById(Integer category);

    public void updateByPrimaryKeySelective(Category category);

    public void deleteByPrimaryKey(Integer cateid);
}
