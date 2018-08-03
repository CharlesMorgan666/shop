package com.mcl.shop.service;

import com.mcl.shop.pojo.CommentExample;
import com.mcl.shop.pojo.Comment;

import java.util.List;

/**
 * @author 莫昌廉
 */
public interface ICommentService {
    public void insertSelective(Comment comment);

    public List<Comment> selectByExample(CommentExample commentExample);
}
