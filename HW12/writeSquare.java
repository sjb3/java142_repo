/*
CSC142
Justin Byun,  No partner at this time
HW#09 Last updated 12/09
Used IDE: MS VS_Code
Test: passed
*/

public class Main {
    public static void main(String[] args) {
        writeSquares(9);
    }
    public static void writeSquares(int n){
        int curr = n;
        if(n==1){
            System.out.println(1);
            return ;
        }
        if(n%2 == 0)
            curr = n-1;
        writeSquaresUtil(curr, true, n);
    }
    // a util function
    // oddFlag - to check whether we have to print odd square or even
    public static void writeSquaresUtil(int curr, boolean oddFlag, int n){
        if((curr == 1) && oddFlag){
            System.out.print(1+", ");
            writeSquaresUtil(curr+1, false, n);
        }
        else if(oddFlag){ // to print odd
            System.out.print((curr*curr)+ ", ");
            writeSquaresUtil(curr-2, oddFlag, n);
        }
        else if(!oddFlag && curr <= n){
            if(curr==n || (curr+1)==n)
                System.out.println((curr*curr));
            else
                System.out.print((curr*curr+", "));
            writeSquaresUtil(curr+2, oddFlag, n);
        }
        else
            return;

    }
}
