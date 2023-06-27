package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remainAmountToBuy() {

            CashbackHackService cashbackHackService = new CashbackHackService();
            int amount = 800;

            int actual = cashbackHackService.remain(amount);
            int expected = 200;

            assertEquals(actual, expected);
    }
}