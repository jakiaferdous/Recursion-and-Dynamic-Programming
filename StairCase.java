package com.company;


/*Triple Step: A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3
steps at a time. Implement a method to count how many possible ways the child can run up the
stairs. */


public class StairCase {


    //recursion
    public static int numOfWaysRecur(int stair) {

        if (stair <= 0) {
            return 1;
        }
        if (stair <= 2) {
            return stair;
        }
        return numOfWaysRecur(stair - 1) + numOfWaysRecur(stair - 2) + numOfWaysRecur(stair - 3);
    }


    //recursion with memoization
    public static int numOfWays(int stair, int[] array) {

        if (array[stair] != 0) {
            return array[stair];
        }

        if (stair <= 0) {
            return 1;
        }
        if (stair <= 2) {
            return stair;
        }
        array[stair] = numOfWays(stair - 1, array) + numOfWays(stair - 2, array) + numOfWays(stair - 3, array);

        return array[stair];
    }

    // dynamic programming
    public static int numOfWaysTwo(int stair) {

        if (stair <= 0) {
            return 1;
        }
        if (stair <= 2) {
            return stair;
        }

        int step0 = 1;
        int step1 = 1;
        int step2 = 2;
        int last = 0;

        for (int i = 3; i <= stair; i++) {

            last = step0 + step1 + step2;
            step0 = step1;
            step1 = step2;
            step2 = last;

        }

        return last;

    }



    public static int numOfWaysWithNStep(int stair, int[] step) {

        int[] a = new int[stair + 1];
        a[0] = 1;
        a[1] = 1;

        for (int i = 2; i <= stair; i++) {

            for (int k : step) {

                if (i >= k) {

                    a[i] += a[i - k];

                }
            }
        }
        return a[stair];


    }

    public static void main(String[] args) {
        int[] steps = {1, 3, 2};
        int stair = 4;
        int[] array = new int[stair + 1];
        System.out.println(numOfWaysRecur(4));
    }
}
