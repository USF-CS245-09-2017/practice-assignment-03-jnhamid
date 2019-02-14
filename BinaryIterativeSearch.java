public class BinaryIterativeSearch implements Practice03Search {
    public String searchName(){
        return "Binary Iterative";
    }
    //binary search we learned in class
    public int search(int array[], int target){
        int start = 0, end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (array[mid] == target)
                return mid;


            if (array[mid] < target)
                start = mid;
            else
                end = mid - 1;
        }

        return -1;
    }

}

