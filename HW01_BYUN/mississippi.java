/**
 * CSC 142
 * Sung Justin Byun No partner at this stage
 * HW#1 Last updated 09/27
 * appx. 5 hours total
 * Used IDE: IntelliJIDEA(Eclipse)
 **/

// Mississippi ////////////////

public class Mississippi {
    public static void main(String[] args) {
        System.out.println("1. Mississippi:");
        m_method();
        iss_method();
        iss_method();
        ip_method();
        pi_method();
        System.out.println();
    }
    public static void m_method() {
        System.out.println("M     M");
        System.out.println("MM   MM");
        System.out.println("M M M M");
        System.out.println("M  M  M");
        System.out.println("M     M");
        System.out.println("M     M");
        System.out.println("M     M");
    };
    public static void i_method() {
        System.out.println("IIIII");
        System.out.println("  I  ");
        System.out.println("  I  ");
        System.out.println("  I  ");
        System.out.println("  I  ");
        System.out.println("  I  ");
        System.out.println("IIIII");
    };
    public static void s_method() {
        System.out.println("   SSSSS   ");
        System.out.println(" S       S ");
        System.out.println(" S         ");
        System.out.println("   SSSSS   ");
        System.out.println("          S");
        System.out.println(" S       S ");
        System.out.println("   SSSSS   ");
    };
    public static void p_method() {
        System.out.println("PPPPP");
        System.out.println("P    P");
        System.out.println("P    P");
        System.out.println("PPPPP");
        System.out.println("P");
        System.out.println("P");
        System.out.println("P");
    };
    public static void iss_method() {
        i_method();
        s_method();
        s_method();
    };
    public static void ip_method() {
        i_method();
        p_method();
    };
    public static void pi_method() {
        p_method();
        i_method();
    };
}
