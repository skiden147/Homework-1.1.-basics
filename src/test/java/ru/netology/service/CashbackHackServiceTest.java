package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class CashbackHackServiceTest {


    @Test
    public void shouldReturn100IfAmountIs900() {
        CashbackHackService hackService = new CashbackHackService();

        int actual = hackService.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }


    @Test
    public void shouldReturn1000IfAmountIs0() {
        CashbackHackService hackService = new CashbackHackService();

        int actual = hackService.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn999IfAmountIs1() {
        CashbackHackService hackService = new CashbackHackService();

        int actual = hackService.remain(1);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService hackService = new CashbackHackService();

        int actual = hackService.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

}