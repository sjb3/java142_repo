/*
CSC142
Justin Byun,  No partner at this time
HW#09 Last updated 12/02
Used IDE: MS VS_Code
Test: passed
*/

public static void minToFront(ArrayList<Integer> numList) {
  int min = numList.get(0);

  for(int i=0; i<numList.size(); i++) {

      if(min>numList.get(i)) {

          min = numList.get(i);
          numList.remove(numList.indexOf(min));
          numList.add(0, min);
      }
  }
  System.out.println(numList);
}