package com.semen.z.problem_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MultiplicandElementsTest {

    private MultiplicandElements solver = new MultiplicandElements();

    private int[] case1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int[] case2 = {};
    private int[] case3 = {2, 4};
    private int[] negative = {-1, -2, 4, 1};

    private int[] result1 = {362880, 181440, 120960, 90720, 72576, 60480, 51840, 45360, 40320};
    private int[] result2 = {};
    private int[] result3 = {4, 2};
    private int[] resultNegative = {-8, -4, 2, 8};

    @Test
    void firstMethodNoBonus() {
        assertArrayEquals(result1, solver.firstMethodNoBonus(case1));
        assertArrayEquals(result2, solver.firstMethodNoBonus(case2));
        assertArrayEquals(result3, solver.firstMethodNoBonus(case3));
        assertArrayEquals(resultNegative, solver.firstMethodNoBonus(negative));
    }

    @Test
    void noDivision() {
        assertArrayEquals(result1, solver.noDivision(case1));
        assertArrayEquals(result2, solver.noDivision(case2));
        assertArrayEquals(result3, solver.noDivision(case3));
        assertArrayEquals(resultNegative, solver.noDivision(negative));
    }
}