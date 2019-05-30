package com.company;

public class Main {
    static String[] getAllSubsets(int[] set) {

        int len = (int) Math.pow(2, set.length);
        String[] binaryArray = new String[len];
        binaryArray[0] = "01";

        // generate binary numbers
        for (int i = 1, j = 0; i < len; i += 2, j++) {

            binaryArray[i] = binaryArray[j] + "0";
            if (i + 1 < len) {
                binaryArray[i + 1] = binaryArray[j] + "1";
            }

        }


        //convert integer array to string array
        String[] set2 = new String[set.length];
        for (int i = 0; i < set.length; i++) {
            set2[i] = String.valueOf(set[i]);
        }



        // assign an array of strings
        String[] subsetArray = new String[len];


        for (int j = 0; j < binaryArray.length; j++) {


            for (int i = binaryArray[j].length() - 1, k = 0; i >= 0; i--, k++) {

                if (k > set.length - 1) {
                    continue;
                }

                if (binaryArray[j].charAt(i) == '1') {

                    subsetArray[j] += set2[k] + ",";
                }
            }

            if (j == binaryArray.length - 1) {
                continue;
            }
            subsetArray[j] = subsetArray[j].replace("null", "");

        }

        return subsetArray;


    }

    public static void main(String[] args) {


        int[] set = {3, 4, 6, 5};

        String[] s = getAllSubsets(set);
        System.out.println("len = " + s.length);

        for (String a : s) {
            System.out.println(a);
        }


    }
}
