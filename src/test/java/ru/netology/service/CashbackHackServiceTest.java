package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void remainToBuy() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 800;

        int actual = cashbackHackService.remain(amount);
        int expected = 200;

        assertEquals(expected, actual);
    }

    @Test
    public void remainToBuyIfAmountThousand() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }


}