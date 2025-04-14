package Arrays2DSearchingUsingBinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class Max0sAnd1s {
    public static void main (String[] args){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 1, 1)));

        int rows = 3;
        int cols = 3;

        System.out.println(RowWithMax1s(matrix, rows, cols));
    }

    public static int RowWithMax1s(ArrayList<ArrayList<Integer>> matrix, int rows, int cols){

        int count_max_of_1 = 0;
        int index = -1;
        for (int i = 0; i < rows; i++){
            int current_count_of_1 = 0;
            for (int j = 0; j < cols; j++){
                current_count_of_1 = current_count_of_1 + matrix.get(i).get(j);
            }
            if (current_count_of_1 > count_max_of_1){
                count_max_of_1 = current_count_of_1;
                index = i;
            }
        }
        return index;
    }
}
