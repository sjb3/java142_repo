public class countLetterOnly{

     public static void main(String []args){
        System.out.println(count("Helluv78&&&w"));
     }
     public static int count(String phrase) {
         int count = 0;

         for(int i=0; i <phrase.length(); i ++) {
             char ch = phrase.charAt(i);
             if(Character.isLetter(ch)) {
                 count ++;
             }
         }
         return count;
     }
}
