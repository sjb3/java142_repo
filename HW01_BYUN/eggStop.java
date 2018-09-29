/**
 * CSC 142
 * Sung Justin Byun No partner at this stage
 * HW#1 Last updated 09/27
 * appx. 5 hours total
 * Used IDE: IntelliJIDEA(Eclipse)
 **/

// EggStop ////////////////

public class EggStop {
    public static void main(String[] args) {
        System.out.println("15. EggStop: ");
        eG4();
        eG5();
        eG5();
        System.out.println(" +----+");
        eG4();
        System.out.println("| STOP |");
        eG5();
        eG4();
        System.out.println("+------+\n");
    }
    public static void eG1() {
        System.out.println("  ----  ");
    }
    public static void eG2() {
        System.out.println(" /    \\");
        System.out.println("/      \\");
    }
    public static void eG3() {
        System.out.println("\\      /");
        System.out.println(" \\    /");
    }
    public static void eG4() {
        eG1();
        eG2();
    }
    public static void eG5() {
        eG3();
        eG1();
    }
}
