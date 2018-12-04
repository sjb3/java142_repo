/*
CSC142
Justin Byun,  No partner at this time
HW#09 Last updated 12/02
Used IDE: MS VS_Code
Test: passed
*/

public static ArrayList<String> stutter(ArrayList<String>aList, int k) {
  if k<0 {
    return [];
  }

  ArrayList<String> newList = new ArrayList<String>();

  for(int i=0; i<aList.size(); i++) {
    for(int j=1; j<=k;j++) {
      newList.add(aList.get(i));
    }
  }
  return newList;
}