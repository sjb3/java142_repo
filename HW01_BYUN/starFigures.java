/**
 * CSC 142
 * Sung Justin Byun No partner at this stage
 * HW#1 Last updated 09/27
 * appx. 5 hours total
 * Used IDE: IntelliJIDEA(Eclipse)
 **/

    // StarFigure ////////////////

public class StarFigure {
    public static void sF1() {
        System.out.println("*****\n*****");
    }
    public static void sF2() {
        System.out.println(" *  *\n   *\n *  *");
    }
    public static void sF3() {
        System.out.println("   *\n   *\n   *");
    }
    public static void sF4() {
        sF1();
        sF2();
    }
    public static void main(String[] args) {
        System.out.println("13. StarFigures: ");
        sF4();
        System.out.println();
        sF4();
        sF1();
        sF3();
        sF4();
        System.out.println();
    }
}
