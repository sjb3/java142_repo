/*
CSC 142
Justin Byun No partner at this time
HW#08 Last updated 11/15
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
*/

package com.example.java;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] a = {200};
        System.out.println(priceIsRight(a, 20));
    }

    public static int priceIsRight(int[] bids, int price) {
//        int max = bi;
        int max = -1;
        for(int i=0; i<bids.length; i++) {
            if(bids[i]<price && bids[i]>max) {
                max = bids[i];
            }
        }
        return max;
    }
}
