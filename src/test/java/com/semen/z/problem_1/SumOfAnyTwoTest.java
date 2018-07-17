package com.semen.z.problem_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SumOfAnyTwoTest {

    private SumOfAnyTwo solver = new SumOfAnyTwo();

    private int[] case1 = {1, 2, 3, 4, 2, 15, 4, 2, 3, 22, 2, 3, 4, 2, 3, 22, 2, 15, 4, 2, 3, 30};
    private int[] case2 = {1, 22, 3, 4, 2, 15, 4, 2, 3, 4, 2, 22, 4, 2, 15, 4, 2, 3, 4, 30, 15, 4};
    private int[] edgeCase1 = {1};
    private int[] edgeCase2 = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4};

    private int case1Sum = 52;
    private int case2Sum = 45;
    private int random = 0;
    private int edgeCase2Sum = 9;

    @Test
    void testNoBonusApproach() {
        assertTrue(solver.noBonusApproach(case1, case1Sum));
        assertTrue(solver.noBonusApproach(case2, case2Sum));
        assertFalse(solver.noBonusApproach(edgeCase1, random));
        assertFalse(solver.noBonusApproach(edgeCase2, edgeCase2Sum));
    }

    @Test
    void testSlowWithBonus() {
        assertTrue(solver.slowWithBonus(case1, case1Sum));
        assertTrue(solver.slowWithBonus(case2, case2Sum));
        assertFalse(solver.slowWithBonus(edgeCase1, random));
        assertFalse(solver.slowWithBonus(edgeCase2, edgeCase2Sum));
    }

    @Test
    void testFastWithSort() {
        assertTrue(solver.fastWithSortAndBonus(case1, case1Sum));
        assertTrue(solver.fastWithSortAndBonus(case2, case2Sum));
        assertFalse(solver.fastWithSortAndBonus(edgeCase1, random));
        assertFalse(solver.fastWithSortAndBonus(edgeCase2, edgeCase2Sum));
    }
}