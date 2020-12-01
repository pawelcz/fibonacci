package com.pczyz.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class FibonacciTest {

    @ParameterizedTest
    @MethodSource("values")
    void shouldReturnFibonacciForGivenNumberIteratively(int number, int expectedResult) {
        //given
        Fibonacci fibonacci = new Fibonacci(false);

        //when
        long result = fibonacci.getValue(number);

        //then
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @MethodSource("values")
    void shouldReturnFibonacciForGivenNumberRecursively(int number, int expectedResult) {
        //given
        Fibonacci fibonacci = new Fibonacci(true);

        //when
        long result = fibonacci.getValue(number);

        //then
        assertEquals(expectedResult, result);
    }

    private static Arguments[] values() {
        return new Arguments[] {
                of(0, 0),
                of(1, 1),
                of(2, 1),
                of(3, 2),
                of(4, 3),
                of(5, 5),
                of(6, 8),
                of(7, 13),
                of(8, 21),
                of(9, 34),
        };
    }

}
