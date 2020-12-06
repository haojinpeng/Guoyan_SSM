package com.it.service;
import com.it.dao.CardMapper;
import com.it.utils.MyBatisHelper;

public class CardServiceImpl implements CardService {
    CardMapper cardMapper = MyBatisHelper.getSqlSessionFactory().getMapper(CardMapper.class);
    @Override
    public void addCard(Integer id, Integer number) {
        cardMapper.addCard(id,number);
    }

    @Override
    public void delCard(Integer id) {
        cardMapper.delCard(id);
    }
}
