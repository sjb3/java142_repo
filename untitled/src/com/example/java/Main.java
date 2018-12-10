package com.example.java;
import java.util.*;

public class Main{

    public static void main(String[] args) {
        mystery(100);
    }

    public static void mystery(int n) {
        if(n<=1) {
            System.out.print(n);
        } else {
            mystery(n/2);
            System.out.print("," + n);
        }
    }
}
