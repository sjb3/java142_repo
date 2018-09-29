/**
 * CSC 142
 * Sung Justin Byun No partner at this stage
 * HW#1 Last updated 09/27
 * appx. 5 hours total
 * Used IDE: IntelliJIDEA(Eclipse)
 **/

// FightSong ////////////////

public class FightSong {
    public static void f_Song1() {
        System.out.println("Go, team, go!\nYou can do it.");
    }
    public static void f_Song2() {

        System.out.println("You\'re the best.\nIn the West.");
    }
    public static void f_Song3() {
        f_Song1();
        f_Song2();
        f_Song1();
        System.out.println("\n");
    }
    public static void main(String[] args) {
        System.out.println("12. FightSong: ");
        f_Song1();
        System.out.println();
        f_Song3();
        f_Song3();
        f_Song1();
        System.out.println();
    }
}
