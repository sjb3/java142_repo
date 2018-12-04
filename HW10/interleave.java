/*
CSC142
Justin Byun,  No partner at this time
HW#09 Last updated 12/02
Used IDE: MS VS_Code
Test: passed
*/

/*
ArrayList<Integer> a1 = new ArrayList<> (Arrays.asList(10, 20, 30));
ArrayList<Integer> a2 = new ArrayList<> (Arrays.asList(4,5,6,7,8));
ArrayList<Integer> newList = new ArrayList<Integer>();
*/

public static void interleave(ArrayList<Integer> a1, ArrayList<Integer> a2) {
  ArrayList<Integer> newList = new ArrayList<>();
    if (a1.size()>= a2.size()) {
      for(int i=0; i<a2.size(); i++) {
        newList.add(a1.get(i));
        newList.add(a2.get(i));
      }
      for(int j=a2.size(); j<a1.size(); j++) {
        newList.add(a1.get(j));
      }
    } else if (a1.size() <= a2.size()) {
      for(int i=0; i<a1.size(); i++) {
      newList.add(a1.get(i));
      newList.add(a2.get(i));
    }
      for(int j=a1.size(); j<a2.size(); j++) {
      newList.add(a2.get(j));
    }
  }
  System.out.println(newList);
}