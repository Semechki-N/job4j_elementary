package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {
    @Test
    void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    @Test
    void testTwoSidesEqualToSum() {
        // Arrange
        double ab = 3.0;
        double ac = 4.0;
        double bc = 7.0;

        // Act
        boolean result = Triangle.exist(ab, ac, bc);

        // Assert
        assertThat(result).isFalse();
    }
}