public class BinaryRecursiveSearch implements Practice03Search {
    @Override
    public String searchName() {
        return "Binary Recursive";
    }


    public int search(int[] array, int target) {
        return search(array, target, 0, array.length-1);
    }
    //recursive binary search we learned in class
    public int search(int[] array, int target, int start, int end) {
        if (end >= start) {
            int mid = start + (end - start) / 2;

            //stop if mid is target
            if (array[mid] == target) {
                return mid;
            }
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (array[mid] > target) {
                return search(array, target, start, mid - 1);
            }

                return search(array, target, mid + 1, end);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
}

