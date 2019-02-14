public class LinearSearch implements Practice03Search {
    @Override
    public String searchName() {
        return "Linear";
    }
    //linear search we learned in class
    public int search(int[] array, int target){

        for(int i = 0; i< array.length;i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
}

