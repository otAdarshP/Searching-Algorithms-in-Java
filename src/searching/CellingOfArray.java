package searching;
// find the celling of the target, ie. the smallest number which is equal to or greater than the target,
public class CellingOfArray {
    public static void main (String[] args){
        int [] arr = {2, 4, 5, 6, 9, 12, 14, 16, 18};
        int target = 11;
        System.out.println (answer(arr,target));
    }
    static int answer (int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[end] >= arr[start];

        while (end >= start){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                return mid;
            }
            if (isAsc){
                if (target >= mid){
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }
            else{
                if (mid >= target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return start;
    }
}
