package com.mcl.shop.service;

import com.mcl.shop.pojo.Chat;
import com.mcl.shop.pojo.ChatExample;

import java.util.List;

/**
 * @author 莫昌廉
 */
public interface IChatService {
    public void insertChatSelective(Chat chat);

    public List<Chat> selectChatByExample(ChatExample chatExample);
}
