package com.mcl.shop.service;

import com.mcl.shop.pojo.User;
import com.mcl.shop.pojo.UserExample;

import java.util.List;

/**
 * @author 莫昌廉
 */
public interface IUserService {
    public User selectByPrimaryKey(int userId);
    /*public User selectByPrimaryKeyAndPassword(int userId,String password);*/
    public List<User> selectByExample(UserExample userExample);

    public void insertSelective(User user);

    public void deleteUserById(Integer userid);

    public void updateByPrimaryKeySelective(User user);

}
