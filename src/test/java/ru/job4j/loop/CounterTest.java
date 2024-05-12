package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {
    @Test
    public void testReturnsSumOfIntegersBetweenStartAndFinish() {
        int start = 1;
        int finish = 5;
        int result = Counter.sum(start, finish);
        assertEquals(15, result);
    }

    @Test
    public void testReturnsCorrectSumWhenStartAndFinishArePositiveIntegers() {
        int start = 3;
        int finish = 8;
        int result = Counter.sum(start, finish);
        assertEquals(33, result);
    }

    @Test
    public void testReturnsCorrectSumWhenStartIs0() {
        int start = 0;
        int finish = 10;
        int result = Counter.sum(start, finish);
        assertEquals(55, result);
    }

    @Test
    public void testReturnsCorrectSumWhenFinishIs0() {
        int start = 10;
        int finish = 0;
        int result = Counter.sum(start, finish);
        assertEquals(0, result);
    }
}