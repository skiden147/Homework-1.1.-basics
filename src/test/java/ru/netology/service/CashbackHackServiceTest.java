package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class CashbackHackServiceTest {

    @Test
    void shouldReturn100IfAmountIs900() {
        CashbackHackService hackService = new CashbackHackService();

        int actual = hackService.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    void shouldReturn200IfAmountIs1800() {
        CashbackHackService hackService = new CashbackHackService();

        int actual = hackService.remain(1800);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    void shouldReturn900IfAmountIs100() {
        CashbackHackService hackService = new CashbackHackService();

        int actual = hackService.remain(100);
        int expected = 900;

        assertEquals(actual, expected);
    }

    @Test
    void shouldReturn1000IfAmountIs0() {
        CashbackHackService hackService = new CashbackHackService();

        int actual = hackService.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    void shouldReturn999IfAmountIs1() {
        CashbackHackService hackService = new CashbackHackService();

        int actual = hackService.remain(1);
        int expected = 999;

        assertEquals(actual, expected);
    }

}