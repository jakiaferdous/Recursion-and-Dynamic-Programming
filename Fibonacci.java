package com.company;

public class Fibonacci {

    //recursion
    public static int fib2(int num, int [] a) {

        if(a[num] != 0){
            return a[num];
        }

        if (num <= 1) {
            return num;
        }

       a[num] = fib2(num -1,a) + fib2(num -2, a);

        return a[num];

    }


    //recursion
    public static int fibonacci(int num) {

        if (num <= 1) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);

    }


    //recursion with memoization
    public static int fibonacciTwo(int num, int[] array) {

        if (num <= 1) {
            return num;
        }

        if (array[num] != 0) {
            return array[num];
        }


        array[num] = fibonacciTwo(num - 1, array) + fibonacciTwo(num - 2, array);
        return array[num];

    }

    // dynamic programming
    public static int fibonacciThree(int num) {

        if (num <= 1) {
            return num;
        }

        int a1 = 0;
        int a2 = 1;
        int last = 0;

        for (int i = 2; i <= num; i++) {
            last = a1 + a2;
            a1 = a2;
            a2 = last;
        }
        return last;
    }

    public static int fib(int num) {

        if (num <= 1) {
            return num;
        }

        int a = 0;
        int b = 1;
        int sum = a + b;
        for (int i = 3; i <= num; i++) {
            a = b;
            b = sum;
            sum = a + b;

        }
        return sum;

    }


    public static void main(String[] args) {
        // 0,1,1,2,3,5,8
        // 0 1 2 3 4 5 6
        int num = 7;
        int[] array = new int[num + 1];
        System.out.println(fib(6));

    }
}
