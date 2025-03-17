package searching;

public class LinearSearch_Integers {
    public static void main (String [] args){
        int[] arr = {12, 12, 20, 13, 45, 65, 23};
        int target = 20;
        System.out.println (answer(arr, target));
    }
    static boolean answer (int[] arr, int target){
        if (arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++){
            if (target == arr[i]){
                return true;
            }
        }

        for (int i : arr){
            if (i == target){
                return true;
            }
        }
        return false;
    }
}
