public static int binarySearch(int[] array, int key, int start, int end) {
  if(start <= end) {
    int middle = (start + end)/2;
    if(array[middle] > key) {
      return binarySearch(array, key, start, middle-1);
    } elseif (array[middle] < key){
      return binarySearch(array, key, middle + 1, end);
    } else {
      return middle;
    }
  } else {
    return -1;
  }
}