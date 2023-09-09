package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    void shouldReturn100IfAmountIs900() {
        CashbackHackService hackService = new CashbackHackService();

        int actual = hackService.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn200IfAmountIs1800() {
        CashbackHackService hackService = new CashbackHackService();

        int actual = hackService.remain(1800);
        int expected = 200;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn900IfAmountIs100() {
        CashbackHackService hackService = new CashbackHackService();

        int actual = hackService.remain(100);
        int expected = 900;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn1000IfAmountIs0() {
        CashbackHackService hackService = new CashbackHackService();

        int actual = hackService.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn999IfAmountIs1() {
        CashbackHackService hackService = new CashbackHackService();

        int actual = hackService.remain(1);
        int expected = 999;

        assertEquals(expected, actual);
    }

}