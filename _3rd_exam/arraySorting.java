import java.util.*;

public class ArraySorting {
  public static void main(String[] args) {
    int[] arr = {2, 33, -2, 300, 9, 0};
    arr_sort(arr);
  }
  // how to sort array - ASC
  public static void arr_sort(int[] a) {
    System.out.println("Before sorting: " + Arrays.toString(a));

    for(int i=0; i<a.length; i++) {
      for(int j=i+1; j<a.length; j++) {
        // int temp =0;
        if(a[i] > a[j]) {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }

      }
    }
     System.out.println("After sorting: " + Arrays.toString(a));
  }
}