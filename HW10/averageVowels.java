/*
CSC142
Justin Byun,  No partner at this time
HW#09 Last updated 12/02
Used IDE: MS VS_Code
Test: passed
*/

public static double averageVowels(ArrayList<String> aList) {
  if(aList.size() < 0) {
    return 0.0;
  }

    int vowel_count = 0;
    String newStr = "";

    for(int i=0; i<aList.size(); i++) {
      newStr += aList.get(i);
    }
    String fixedStr = newStr.toLowerCase();

    for(int i=0; i<fixedStr.length(); i++) {
      if( (fixedStr.charAt(i) == 'a') ||
          (fixedStr.charAt(i) == 'e') ||
          (fixedStr.charAt(i) == 'i') ||
          (fixedStr.charAt(i) == 'o') ||
          (fixedStr.charAt(i) == 'u')) {
            vowel_count ++;
          }
        return (double)vowel_count/fixedStr.length();
        }
}
