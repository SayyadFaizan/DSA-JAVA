package ArrayLeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    //Brute Force
//    public static int[] twoSum(int[] nums, int target){
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if(nums[i] + nums[j] == target){
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }

    //Optimize
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement =  target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i],i );
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,5, 7};
        int target = 10;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
