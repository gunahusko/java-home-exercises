package io.codelex.test.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinerTest {

    @Test
    void testToSeparateAndJoinWithSpecialSign() {
        Joiner<Integer> numbers = new Joiner<>("-");
        String actualResult = numbers.join(1, 2, 3, 4, 5);
        String expectedResult = "1-2-3-4-5";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDifferentType() {
        Joiner<Double> numbers2 = new Joiner<>("=====");
        String actualResult = numbers2.join(6.0, 8.0, 7.6, 78954.0);
        String expectedResult = "6.0=====8.0=====7.6=====78954.0";

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
