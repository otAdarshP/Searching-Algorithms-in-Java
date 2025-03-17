package searching;

import java.util.Arrays;

public class SearchingInStrings{
    public static void main (String[] args){
        String name = "Adarsh";
        char target = 'a';
        System.out.println (Arrays.toString(name.toCharArray()));
        System.out.println (answer(name, target));
    }

    static boolean answer (String name, char target){
        if (name.length() == 0){
            return false;
        }
        // iterates over the target concerned.
        for (char ch : name.toCharArray()){
            if (ch == target){
                return true;
            }
        }
// finds the boolean answer
        for (int i = 0; i < name.length(); i++){
            if (target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}