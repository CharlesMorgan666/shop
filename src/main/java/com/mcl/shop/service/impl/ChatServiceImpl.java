package com.mcl.shop.service.impl;

import com.mcl.shop.dao.ChatMapper;
import com.mcl.shop.pojo.Chat;
import com.mcl.shop.pojo.ChatExample;
import com.mcl.shop.service.IChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 莫昌廉
 */
@Service("chatService")
public class ChatServiceImpl implements IChatService {

    @Autowired(required = false)
    ChatMapper chatMapper;

    @Override
    public void insertChatSelective(Chat chat) {
        chatMapper.insertSelective(chat);
    }

    @Override
    public List<Chat> selectChatByExample(ChatExample chatExample) {
        return chatMapper.selectByExample(chatExample);
    }
}
