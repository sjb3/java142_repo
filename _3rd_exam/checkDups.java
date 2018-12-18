// check for dups
// consider, first array will be iterated from the first to the second to the last el
// comparing next array will be iterated from the second to the last el of the same array.

public class Check4Dups {
  public static void main(String[] args) {
    int[] arr = {1,2,5,4,3,6,2,3,1};

    for(int i=0; i<arr.length-1; i++) {
      for(int j=i+1; j<arr.length; j++) {
        if(arr[i] == arr[j]) {
          System.out.println("The duplicate element is " + arr[j]);
        }
      }
    }
  }
}
