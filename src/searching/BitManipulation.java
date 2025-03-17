package searching;

class BitManipulation {
    public int singleNumber(int[] nums) {
        nums = new int[]{2, 1, 2, 1, 4};
        int n = nums.length;
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }
}