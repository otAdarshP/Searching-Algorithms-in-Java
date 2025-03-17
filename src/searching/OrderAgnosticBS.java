package searching;
// this program is useful for both, ascending and descending Binary Searches.
public class OrderAgnosticBS {
    public static void main (String[] args){
//        int [] arr = {12, 23, 34, 45, 56, 67, 78 ,87};
        int [] arr = {87, 78, 67, 56, 45, 34, 23, 12};
        int target = 34;
        System.out.println (orderAgnosticBS(arr, target));
    }
    static int orderAgnosticBS(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr [end] > arr [start];

        while (end >= start){
            int mid = start + (end - start)/2;

            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
