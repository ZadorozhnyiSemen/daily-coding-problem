package com.semen.z.problem_2;

import java.util.Arrays;

/**
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
 *
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 *
 * Follow-up: what if you can't use division?
 */
class MultiplicatedElements {

    /*
     * First try approach ignoring Bonus task just to make it work and see edge cases
     * Speed O(2n)
     */
    int[] firstMethodNoBunus(int[] input) {
        int length = input.length;
        if (length <= 2) {
            return input;
        }

        int[] result = new int[length];
        int sum = 0;
        for (int element : input) {
            sum += element;
        }

        for (int i = 0; i < length; i++) {
            result[i] = sum / input[i];
        }
        return result;
    }

    /*
     * Same result, no division
     */
    int[] noDivision(int[] input) {
        int length = input.length;
        if (length <= 2) {
            return input;
        }

        int[] result = new int[length];
        Arrays.fill(result, 1); // O(n)
        int shadowValue = 1;

        for (int i = 0; i < length; i++) {
            result[i] = shadowValue;
            shadowValue *= input[i];
        }

        shadowValue = 1;

        for (int i = length - 1; i >= 0; i--) {
            result[i] *= shadowValue;
            shadowValue *= input[i];
        }

        return result;
    }
}
