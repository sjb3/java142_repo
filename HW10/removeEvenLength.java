/*
CSC142
Justin Byun,  No partner at this time
HW#09 Last updated 12/02
Used IDE: MS VS_Code
Test: passed
*/

public static void removeEvenLength(ArrayList<String> aList) {
  for(int i=aList.size()-1; i>=0; i--) {
    if(i%2 !=0) {
      aList.remove(i);
    }
    System.out.println(aList);
  }
}