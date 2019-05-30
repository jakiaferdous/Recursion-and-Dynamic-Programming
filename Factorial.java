package com.company;

public class Factorial {




    //recursion
    public static int factorial(int num) {
        if(num <= 1){
            return 1;
        }
        return num * factorial(num - 1);
    }



    // dynamic programming
    public static int factorialTwo(int num) {

        if(num <= 1){
            return 1;
        }


        int result = 1;

        for(int i = 2; i <= num; i++){
            result *= i;
        }

        return result;


    }




    public static void main(String[] args) {


        //   4! = 4 * 3 * 2 * 1
        //   4! = 4 * 3!
        //   0! = 1
        //   1! = 1
        //   2! = 2

        System.out.println(factorialTwo(3));
    }
}
