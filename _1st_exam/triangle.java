/*
****1
***22
**333
*4444
55555
*/

// public static void triangle (int size) {
//     for(int i=1; i<= size; i++){
//         for (int j=size-1; j>=i; j--) {
//             System.out.print("*");
//         }
//         for(int j=1; j<=size; j++) {
//             System.outprint(i)
//         }
//         System.out.println();
//     }
// }
// alternatively

public class Main {
    public static void main(String[] args) {

        for(int i=1; i<=5 ; i++){
            for (int j=1; j<=5-i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
