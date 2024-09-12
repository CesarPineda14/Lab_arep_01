package com.mycompany.calculator;

import java.util.Arrays;

public class ReflexCalculator {

    public static void bubbleSort(int[] args) {
        boolean flag = true;
        int pos = 0;
        int compare = 0;
        System.out.println("lista inicial:" +Arrays.toString(args));

        while (flag) {
            if (pos == args.length - 1) {
                pos = 0;
                System.out.println("lista iterada:" + Arrays.toString(args));
                if (compare == 0) {
                    System.out.println("lista final:" + Arrays.toString(args));
                    flag = false;
                    
                }
                else{
                    compare = 0;
                }
            }
            if (args[pos] > args[pos + 1]) {
                int Save1 = args[pos];
                int Save2 = args[pos + 1];
                args[pos] = Save2;
                args[pos + 1] = Save1;
                
                compare += 1;
            }
            pos += 1;
        }

    }
}
