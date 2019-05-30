package com.company;


/*Robot in a Grid: Imagine a robot sitting on the upper left corner of grid with r rows and c columns.
  The robot can only move in two directions, right and down. How many possible paths are there for the
  robot to go from  */


public class RobotInAGrid {


    // dynamic programming
    public static int numOfWays(int x, int y) {


        int[][] array = new int[x][y];

        for (int r = 0; r < x; r++) {
            array[r][0] = 1;
        }
        for (int c = 0; c < y; c++) {
            array[0][c] = 1;
        }

        for (int r = 1; r < x; r++) {
            for (int c = 1; c < y; c++) {
                array[r][c] = array[r - 1][c] + array[r][c - 1];
            }
        }
        return array[x - 1][y - 1];

    }


    //recursion
    public static int numOfWaysTwo(int x, int y) {

        if(x == 0 && y == 0){
            return 0;
        }
        if ((x == 0 && y != 0) || (x != 0 && y == 0)) {
            return 1;
        }
        return numOfWaysTwo(x, y - 1) + numOfWaysTwo(x - 1, y);
    }


    //recursion with memoization
    public static int numOfWaysThree(int x, int y) {

        int[][] array = new int[x][y];
        if (array[x - 1][y - 1] != 0) {
            return array[x - 1][y - 1];
        }

        if (x == 0 && y == 0) {
            return 0;
        } else if ((x == 1 && y != 1) || (x != 1 && y == 1)) {
            return 1;
        }
        array[x - 1][y - 1] = numOfWaysThree(x, y - 1) + numOfWaysThree(x - 1, y);
        return array[x - 1][y - 1];
    }

    public static void main(String[] args) {


        int x = 2;
        int y = 2;

        int ways = numOfWaysTwo(x,y);
        System.out.println(ways);
    }
}
