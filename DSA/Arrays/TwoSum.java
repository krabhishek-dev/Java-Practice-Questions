// Two Sum problem
import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {
        int[] numArray = {2, 7, 15, 9, 6, 20};
        int target = 11;

        TwoSum obj = new TwoSum();
        int[] result = obj.twoSum(numArray, target);

        if (result.length == 2) {
            System.out.println("Target found!");
            System.out.println("Index: " + result[0] + " and " + result[1]);
            System.out.println("Values: " + numArray[result[0]] + " + " 
                               + numArray[result[1]] + " = " + target);
        } else {
            System.out.println("Target not found.");
        }
    }

// Brute Force approach - O(n) time
    // public int[] twoSum(int[] nums, int target) {

    //     for (int i = 0; i < nums.length; i++) {

    //         for (int j = i + 1; j < nums.length; j++) {

    //             if (nums[i] + nums[j] == target) {
    //                 return new int[]{i, j};
    //             }
    //         }
    //     }

    //     return new int[]{};
    // }


// HashMap Approach — O(n) time, O(n) space
public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
