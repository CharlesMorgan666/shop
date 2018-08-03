package com.mcl.shop.service.impl;

import com.mcl.shop.dao.UserMapper;
import com.mcl.shop.pojo.User;
import com.mcl.shop.pojo.UserExample;
import com.mcl.shop.service.IUserService;
import com.mcl.shop.util.MD5Util;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 莫昌廉
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(int userId) {
        return  userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<User> selectByExample(UserExample userExample) {
        return userMapper.selectByExample(userExample);
    }

    @Override
    public void insertSelective(User user) {
        user.setPassword(MD5Util.MD5EncodeUtf8(user.getPassword()));
        userMapper.insertSelective(user);
    }

    @Override
    public void deleteUserById(Integer userid) {
        userMapper.deleteByPrimaryKey(userid);
    }

    @Override
    public void updateByPrimaryKeySelective(User user) {
        if(user.getPassword()!=null &&!"".equals(user.getPassword()))
        {
            user.setPassword(MD5Util.MD5EncodeUtf8(user.getPassword()));
        }
        userMapper.updateByPrimaryKeySelective(user);
    }
   /* @Override
    public User selectByPrimaryKeyAndPassword(int userId,String password){return userMapper.selectByPrimaryKeyAndPassword();}*/
}
