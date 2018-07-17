package com.semen.z.problem_1;

import java.util.*;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * <p>
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 * <p>
 * Bonus: Can you do this in one pass?
 */
class SumOfAnyTwo {

    /*
     * Straight forward approach. Bonus rule ignored
     * Speed O(n^2). Memory O(1)
     */
    boolean noBonusApproach(int[] array, int sum) {
        int length = array.length;
        if (length < 2) {
            //Nothing to sum
            return false;
        }

        for (int i = 0; i < length; i++) {
            for (int j = 1 + i; j < length; j++) {
                if (array[i] + array[j] == sum) {
                    //two elements found
                    return true;
                }
            }
        }
        //nothing
        return false;
    }

    /*
     * Slow approach but with bonus. Extra memory usage. Still O(n^2) time.
     */
    boolean slowWithBonus(int[] array, int sum) {
        int length = array.length;
        if (length < 2) {
            return false;
        }
        Deque<Integer> container = new ArrayDeque<>(length);

        for (int item : array) {
            if (container.size() == 0) {
                container.addFirst(item);
                continue;
            }

            for (int j = 0; j < container.size(); j++) {
                Integer holderItem = container.removeLast();
                if (holderItem + item == sum) {
                    return true;
                } else {
                    container.addFirst(holderItem);
                }
            }
            // sum not found
            container.addFirst(item);
        }
        return false;
    }

    /*
     * Approach with sorting
     */
    boolean fastWithSortAndBonus(int[] array, int sum) {
        if (array.length < 2) {
            return false;
        }

        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            if (array[right] >= sum) {
                right--;
                continue;
            }
            if (array[left] + array[right] == sum) {
                return true;
            } else if (array[left] + array[right] < sum) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    /*
     * Best approach - using hash. O(n), one cycle, low memory.
     */
    boolean fastWithHashCollection(int[] array, int sum) {
        int length = array.length;
        if (length < 2) {
            return false;
        }

        HashSet<Integer> holder = new HashSet<>();

        for (int item : array) {
            if (holder.contains(item)) {
                return true;
            }
            holder.add(sum - item);
        }
        return false;
    }
}
