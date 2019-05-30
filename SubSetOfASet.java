package com.company;

/* Power Set: Write a method to return all subsets of a set.  */

public class SubSetOfASet {


    public static void generateBinaryNumber(int n) {

        String[] array = new String[(int) Math.pow(2, n)];

        array[0] = "0";
        for (int i = 0, count = 0; i < array.length - 1; i += 2, count++) {

            array[i] = array[count] + "0";
            array[i + 1] = array[count] + "1";
        }

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }
    }

    public static void generateSubset(int[] set, String[] array) {

        String[][]a = new String[array.length][];


        for(int i = 0; i < set.length;i++){
            if(array[i].contains("1")){

            }

            for(int j = array[i].length() - 1; j >= 0;j--){
               if(array[i].charAt(j) == '1'){

               };

//                if(s == '1'){
//                    a[i][j] = set[j]
//
//                }

            }
        }

    }


    public static void defineSubset(int[] set, int[] array, int i) {

        if (i == set.length) {
            printSet(array);
            System.out.println();
        } else {
            array[i] = -1;
            defineSubset(set, array, i + 1);
            array[i] = set[i];
            defineSubset(set, array, i + 1);
        }


    }

    public static void printSet(int[] a) {
        for (Object x : a) {
            System.out.print(x + " ");
        }
    }


    public static void main(String[] args) {


        int[] set = {45, 67};
        int[] array = new int[set.length];

        //defineSubset(set, array, 0);

        generateBinaryNumber(2);


    }
}
