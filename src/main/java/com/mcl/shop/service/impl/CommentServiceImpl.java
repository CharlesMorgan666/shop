package com.mcl.shop.service.impl;

import com.mcl.shop.dao.CommentMapper;
import com.mcl.shop.pojo.CommentExample;
import com.mcl.shop.pojo.Comment;
import com.mcl.shop.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 莫昌廉
 */
@Service("commentService")
public class CommentServiceImpl implements ICommentService {

    @Autowired(required = false)
    private CommentMapper commentMapper;

    @Override
    public void insertSelective(Comment comment){
        commentMapper.insertSelective(comment);
    }

    @Override
    public List<Comment> selectByExample(CommentExample commentExample) {
        return commentMapper.selectByExample(commentExample);
    }

}
