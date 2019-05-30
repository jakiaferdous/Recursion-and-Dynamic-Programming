package com.company;

/* Magic Index: A magic index in an array A [e ... n - 1] is defined to be an index such that A[i] =
i. Given a sorted array of distinct integers, write a method to find a magic index, if one exists, in
array A.
FOLLOW UP
What if the values are not distinct? */


public class MagicNumber {


    public static int getMagicIndex(int[] array) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == i) {
                return i;
            }
        }
        return -1;

    }

    // values are distinct
    public static int getMagicIndexBinary(int[] array, int start, int end) {

        if (start < 0 || end > array.length || (start > end)) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (mid == array[mid]) {
            return mid;

        }else if(mid < array[mid]){
            return getMagicIndexBinary(array, start, mid - 1);

        }else {
            return getMagicIndexBinary(array, mid + 1, array.length);
        }

    }

    //values are not distinct
    public static int getMagicIndexBinaryTwo(int[] array, int start, int end) {

        int mid = (start + end) / 2;

        if (array[mid] == mid) {
            return mid;
        }

        // search  left
        int leftIndex = Math.min(mid - 1, array[mid]);
        int left = getMagicIndexBinary(array, start, leftIndex);
        if (left >= 0) {
            return left;
        }

        // search  right
        int rightIndex = Math.min(mid + 1, array[mid]);
        int right = getMagicIndexBinary(array, rightIndex, end);

        return right;

    }

    public static void main(String[] args) {

        int[] a = {-1, 0, 1, 3};
        System.out.println(getMagicIndexBinary(a, 0, a.length -1));


    }
}
