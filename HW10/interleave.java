public static void interleave(ArrayList<Integer> a1, ArrayList<Integer> a2) {
  ArrayList<Integer> newList = new ArrayList<>();
  if (a1.size()>= a2.size()) {
    for(int i=0; i<a2.size(); i++) {
      newList.add(a1[i]);
      newList.add(a2[i]);
    }
    for(int j=a2.size(); j<a1.size(); j++) {
      newList.add(a1[j]);
    }
  } else if (a1.size() <= a2.size()) {
    for(int i=0; i<a1.size(); i++) {
    newList.add(a1[i]);
    newList.add(a2[i]);
  }
    for(int j=a1.size(); j<a2.size(); j++) {
    newList.add(a2[j]);
  }
}