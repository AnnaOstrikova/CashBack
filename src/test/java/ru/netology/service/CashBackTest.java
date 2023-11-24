package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashBackTest {

    @Test
    public void testRemainForLessThousand() {
        CashBack service = new CashBack();
        int amount = 700;

        int expected = 300;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainForMoreThousand() {
        CashBack service = new CashBack();
        int amount = 1200;

        int expected = 800;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainForThousand() {
        CashBack service = new CashBack();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}
