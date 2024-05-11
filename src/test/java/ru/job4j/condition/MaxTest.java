package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testMaxWithFirstNumberMaximum() {
        Assertions.assertEquals(10, Max.max(10, 5));
    }

    @Test
    public void testMaxWithSecondNumberMaximum() {
        Assertions.assertEquals(20, Max.max(10, 20));
    }

    @Test
    public void testMaxWithBothNumbersEqual() {
        Assertions.assertEquals(15, Max.max(15, 15));
    }
}