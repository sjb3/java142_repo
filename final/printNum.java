/*
Print numbers from n to 1
*/

public class Main {

    public static void main(String[] args){


    }
    public static void printNumbers(int num) {
    // define base case
        if(num==0) {
            return;
        } else {
            System.out.println(num);
            printNumbers(num-1);
    // define general case
    }
}
}
