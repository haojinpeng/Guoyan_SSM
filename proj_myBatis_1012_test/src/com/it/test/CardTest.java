package com.it.test;

import com.it.bean.Card;
import com.it.service.CardService;
import com.it.service.CardServiceImpl;
import org.junit.Test;

public class CardTest {
    CardService cardService = new CardServiceImpl();

    @Test
    public void addCard(){
        cardService.addCard(5,1414325);
    }
}
