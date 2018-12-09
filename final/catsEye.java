/*
    Cats have two eyes,
    call the function with the number of cats, and
    return the total numbers of cats eyes
 */

public class Main {

    public static void main(String[] args){


    }
    public static int catsEyes(int num) {
    // define base case
        if(num==0) {
            return 0;
        } else {
            return 2 + catsEyes(num-1);
        }
    // define general case
    }
}
