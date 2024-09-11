package ArrayLeetCode;

public class RemoveDuplicatesArray {
    public static int removeDuplicates(int[] nums) {
        if(nums.length <= 1) return nums.length;
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index-1] != nums[i]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Output: " + removeDuplicates(nums));
    }
}
