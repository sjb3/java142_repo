/**
 * CSC 142
 * Sung Justin Byun No partner at this stage
 * HW#1 Last updated 09/27
 * appx. 5 hours total
 * Used IDE: IntelliJIDEA(Eclipse)
 **/

// Letter ////////////////
// imported module to take advantage of timestamp-ing for footer
import static java.time.ZonedDateTime.*;
public class Letter {
    public static void main(String[] args) {
        System.out.println("2. Letter: ");
        System.out.println();
        myself();;
        greeting();
        // you can customize recipients here
        // import the letter body method per occasion
        footer();
        signature();
    }
    public static void myself() {
        // specify letter head(sender) to address myself
            System.out.println("Justin Byun");
            System.out.println();
            System.out.println("206)555-5555");
            System.out.println("abc@abc.com");
            System.out.println("5555 55th Ave N.E #555");
            System.out.println("Seattle, WA 55555");
            System.out.println();
        }
    public static void greeting() {
    // Very generic greeting part
        System.out.print("How\'re you it's been a while since our late correspondence.\n\n\n\n");
    }
    public static void footer(){
    // For closing note to bow out of it
        System.out.print("Once again, thank you for your time\nand looking forward to hear from you soon\n\n");
        System.out.print("Sincerely yours,\n\n");
    }
    public static void signature() {
    // Personal signature with time stamp
        System.out.println("Jusitn Byun\n\n");
        System.out.println(now());
    }
    // these 2 letter bodies can be used for formal or personal use
    // you can add it to the main method later
    public static void official_body() {
    // letter body for formal occasion, lorem ipsum used for space holder
        System.out.print("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus nisl ante, ornare eu iaculis et,\n tincidunt a erat. Aliquam convallis hendrerit ex, nec malesuada augue consequat id. Integer rutrum orci in nibh rutrum, \nid ultricies urna gravida. In faucibus nisi non est pretium ullamcorper. Donec mollis consectetur libero, a tincidunt \ntortor eleifend eget. Mauris sit amet vulputate quam. Pellentesque in lacus et risus commodo tristique in non dolor. Maecenas sit amet ante sit amet odio aliquam euismod.");
    };
    public static void personal_body() {
    // letter body for personal use, lorem ipsum was used for space holder
        System.out.print("Suspendisse luctus rutrum nibh, \nat aliquet nibh elementum ut. Fusce tristique pellentesque massa \nnec finibus. Quisque et tristique sem, id sollicitudin odio. Donec vestibulum, dolor vel viverra condimentum, \nnisi lacus congue leo, vitae mollis purus nulla in enim. Mauris \nfaucibus erat ut eleifend fermentum. ");
    };
}
