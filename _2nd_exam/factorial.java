package com.example.java;
import java.util.*;

public class Main {

    public static void main(String[] args){
        System.out.println("Calculate factorials: ");
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();

        int product = 1;

        if (num<0) {
          throw new IllegalArgumentException("Negative number is illegal here!");
        }
        for(int i=2; i <=num; i++){
        product *= i;
        }
        System.out.println("The factorial of" + num + " is "+ product);
    }
}
