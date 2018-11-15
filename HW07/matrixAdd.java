/*
CSC 142
Justin Byun No partner at this time
HW#06 Last updated 11/06
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
Status: ?
*/

package com.example.java;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int [][] a = {...}{...};
        int [][] b = {...}{...};
        System.out.println("#19 matrixAdd: ");
        System.out.println(matrixAdd(a, b));
    }

    public static void matrixAdd(int[][] arrA, int[][] arrB) {
      for(int i=0; i< arrA.length; i++) {
        for(int j=0; j<arrB.length; j++) {
          arrC[i][j] = arrA[i][j] + arrB[i][j];
        }
      }
      return arrC;
    }
}
