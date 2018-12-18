
// reversing the string
public static String reverseString(String word) {
  if(word.isEmpty()) return word;
  // otherwise
  return reverseString(word.substring(1)) + word.charAt(0);
}

// count strings only
public static int countChar(string word, Char c) {
  if(word.length() == 0) {
    return 0;
  } else if ((word.substring(0,1)).isLetter(c)) {
    return 1 + countChar(word.substring(1), c);
  } else {
  return 0 + countChar(word.substring(1), c);
}
}
