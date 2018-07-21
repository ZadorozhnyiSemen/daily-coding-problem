package com.semen.z.problem_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLostMinimumTest {
    private FindLostMinimum solver = new FindLostMinimum();

    private int[] case1 = {-2, 1, 4, 0, -5};
    private int[] case2 = {-2, 1,2, 100, 4, 0, -5};
    private int[] case3 = {};
    private int[] case4 = {-1, -2, -3};

    @Test
    void testFirstSolution() {
        assertEquals(2, solver.findLostMinimum(case1));
        assertEquals(3, solver.findLostMinimum(case2));
        assertEquals(1, solver.findLostMinimum(case3));
        assertEquals(1, solver.findLostMinimum(case4));
    }
}