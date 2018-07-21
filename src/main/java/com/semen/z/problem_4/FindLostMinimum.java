package com.semen.z.problem_4;

import java.util.Arrays;

/**
 * Given an array of integers, find the first missing positive integer in linear time and constant space.
 * In other words, find the lowest positive integer that does not exist in the array.
 * The array can contain duplicates and negative numbers as well.
 *
 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
 *
 * You can modify the input array in-place.
 */
class FindLostMinimum {

    int findLostMinimum(int[] array) {
        if (array.length <= 0) {
            return 1;
        }

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                if (i == 0) {
                    return 1;
                } else {
                    if (array[i - 1] <= 0) {
                        return 1;
                    }
                }
            }
            if (array[i] > 0 && i != array.length - 1) {
                if (array[i + 1] - array[i] > 1) {
                    return array[i] + 1;
                }
            }
        }
        int last = array[array.length - 1];
        return last <= 0 ? 1 : last + 1;
    }
}
