///**
// * CSC 142
// * Sung Justin Byun No partner at this stage
// * HW#1 Last updated 09/26
// * appx. 5 hours total
// * Used IDE: IntelliJIDEA(Eclipse)
// **/
//package com.example.java;
//
//import static java.time.ZonedDateTime.*;
//
//public class Main {
//    // main method
//    public static void main(String[] args) {
//        stewie();
//        spikey();
//        difference();
//        muchBetter();
//        mantra();
//        stewie2();
//        egg();
//        fightSong();
//        starFigures();
//        eggStop();
//        mississippi();
//        letter();
//
//    }
//    // Stewie ////////////////
//    public static void stewie() {
//        System.out.println("1. Stewie: ");
//	    System.out.println("//////////////////////");
//	    System.out.println("|| Victory is mine! ||");
//	    System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n");
//    }
//    // Spikey ///////////////////
//    public static void spikey() {
//        System.out.println("2. Spikey: ");
//        System.out.println("\t\\/");
//        System.out.println("   " + "\\\\//");
//        System.out.println(" " + "\\\\\\\\////");
//        System.out.println(" " + "////\\\\\\\\");
//        System.out.println("   " + "//\\\\");
//        System.out.println("\t/\\\n");
//    }
//    // Difference /////////////////
//    public static void difference() {
//        System.out.println("4. Difference:");
//        System.out.println("what is the difference between\n" +
//                "a \' and a \"? or between a \" and a\\\"?\n" +
//                "One is what we see when we\'re typing our program.\n" +
//                "The other is what appears one the \"\" console\"\n");
//    }
//    // MuchBetter ///////////////////
//    public static void muchBetter() {
//        System.out.println("5. MuchBetter:");
//        System.out.println("A \"quoted\" String is\n\'much\' better if you learn\n" +
//                "the rules of \"escape sequences.\"\nAlso, \" \" represents an empty String.\n" +
//                "Dont\'t forget: use \\\" instead of \"!\n\" is not the same as \"\n"
//        );
//    }
//    // Mantra ///////////////////////
//    public static void mantra() {
//        System.out.println("7. Mantra:");
//        System.out.println("There\'s one thing every coder must understand:\nThe system.outprintln commnand.\n\n" +
//        "There\'s one thing every coder must understand:\nThe system.outprintln commnand.\n");
//    }
//    // Stewie2, do use static methods to excercise modularization
//    public static void stewie2_module() {
//        System.out.println("|| Victory is mine! ||");
//    }
//    public static void stewie2_module2() {
//        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
//    }
//    public static void stewie2() {
//        System.out.println("1. Stewie2: ");
//        System.out.println("//////////////////////");
//        stewie2_module();
//        stewie2_module2();
//        stewie2_module();
//        stewie2_module2();
//        stewie2_module();
//        stewie2_module2();
//        stewie2_module();
//        stewie2_module2();
//        stewie2_module();
//        stewie2_module2();
//        System.out.println();
//    }
//    // Egg /////////////////////////////////////////
//    public static void egg() {
//        System.out.println("9. Egg: ");
//        System.out.println("  ----------");
//        System.out.println(" /          \\");
//        System.out.println("/            \\");
//        System.out.println("-\'\'-\'-\' \'-\'-\'\'-");
//        System.out.println("\\             /");
//        System.out.println(" \\           /");
//        System.out.println("  ----------");
//        System.out.println();
//    }
//    // FightSong //////////////////////////////////////////
//    public static void f_Song1() {
//
//        System.out.println("Go, team, go!\nYou can do it.");
//    }
//    public static void f_Song2() {
//
//        System.out.println("You\'re the best.\nIn the West.");
//    }
//    public static void f_Song3() {
//        f_Song1();
//        f_Song2();
//        f_Song1();
//        System.out.println("\n");
//    }
//    public static void fightSong() {
//        System.out.println("12. FightSong: ");
//        f_Song1();
//        System.out.println();
//        f_Song3();
//        f_Song3();
//        f_Song1();
//        System.out.println();
//    }
//    // StarFigure /////////////////////////////////////////////////
//    public static void sF1() {
//        System.out.println("*****\n*****");
//    }
//    public static void sF2() {
//        System.out.println(" *  *\n   *\n *  *");
//    }
//    public static void sF3() {
//        System.out.println("   *\n   *\n   *");
//    }
//    public static void sF4() {
//        sF1();
//        sF2();
//    }
//    public static void starFigures() {
//        System.out.println("13. StarFigures: ");
//        sF4();
//        System.out.println("\n");
//        sF4();
//        sF1();
//        sF3();
//        sF4();
//        System.out.println("\n");
//    }
//    // EggStop ////////////////////////
//    public static void eG1() {
//        System.out.println("  ----  ");
//    }
//    public static void eG2() {
//        System.out.println(" /    \\");
//        System.out.println("/      \\");
//    }
//    public static void eG3() {
//        System.out.println("\\      /");
//        System.out.println(" \\    /");
//    }
//    public static void eG4() {
//        eG1();
//        eG2();
//    }
//    public static void eG5() {
//        eG3();
//        eG1();
//    }
//    public static void eggStop() {
//        System.out.println("15. EggStop: ");
//        eG4();
//        eG5();
//        eG5();
//        System.out.println(" +----+");
//        eG4();
//        System.out.println("| STOP |");
//        eG5();
//        eG4();
//        System.out.println("+------+\n");
//    }
//    // Mississippi
//    public static void m_method() {
//        System.out.println("M     M");
//        System.out.println("MM   MM");
//        System.out.println("M M M M");
//        System.out.println("M  M  M");
//        System.out.println("M     M");
//        System.out.println("M     M");
//        System.out.println("M     M");
//    };
//    public static void i_method() {
//        System.out.println("IIIII");
//        System.out.println("  I  ");
//        System.out.println("  I  ");
//        System.out.println("  I  ");
//        System.out.println("  I  ");
//        System.out.println("  I  ");
//        System.out.println("IIIII");
//    };
//    public static void s_method() {
//        System.out.println("   SSSSS   ");
//        System.out.println(" S       S ");
//        System.out.println(" S         ");
//        System.out.println("   SSSSS   ");
//        System.out.println("          S");
//        System.out.println(" S       S ");
//        System.out.println("   SSSSS   ");
//    };
//    public static void p_method() {
//        System.out.println("PPPPP");
//        System.out.println("P    P");
//        System.out.println("P    P");
//        System.out.println("PPPPP");
//        System.out.println("P");
//        System.out.println("P");
//        System.out.println("P");
//    };
//    public static void iss_method() {
//        i_method();
//        s_method();
//        s_method();
//    };
//    public static void mississippi() {
//        System.out.println("1. Mississippi:");
//        m_method();
//        iss_method();
//        iss_method();
//        i_method();
//        p_method();
//        p_method();
//        i_method();
//        System.out.println();
//    }
//    // Letter //////////////////////////////////////
//    public static void myself() {
//    // specify letter head(sender) to address myself
//        System.out.println("Justin Byun");
//        System.out.println();
//        System.out.println("206)555-5555");
//        System.out.println("abc@abc.com");
//        System.out.println("5555 55th Ave N.E #555");
//        System.out.println("Seattle, WA 55555");
//        System.out.println();
//    }
//    public static void greeting() {
//    // Very generic greeting part
//        System.out.print("How\'re you it's been a while since out late correspondence.\n\n\n\n");
//    }
//    public static void footer(){
//    // For closing note to bow out of it
//        System.out.print("Once again, thank you for your time\nand looking forward to hear from you soon\n\n");
//        System.out.print("Sincerely yours,\n\n");
//    }
//    public static void signature() {
//    // Personal signature with time stamp
//        System.out.println("Jusitn Byun\n\n");
//        System.out.println(now());
//    }
//    public static void letter() {
//        System.out.println("2. Letter: ");
//        System.out.println();
//        myself();;
//        greeting();
//        footer();
//        signature();
//    }
//}

public class Main {
    public static final int MAX = 5;

    public static void unknown() {
        int number = 0;
        for(int count = MAX; count >=0; count--) {
            number += (count*count);
        }
        System.out.println("THE RESULT IS: "+ number);
    }
    public static void main(String[] args) {
        unknown();
    }
}