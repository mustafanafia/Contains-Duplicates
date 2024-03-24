import java.util.HashMap;
import java.util.HashSet;

public class Main {


    public static void main(String[] args) {


        Main o = new Main();

        int[] nums = {1, 2, 3, 1};
        int k = 3;

        System.out.println(o.containsNearbyDuplicate(nums, k));

    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int curr = nums[i];

            if (map.containsKey(curr) && i - map.get(curr) <= k) {
                return true;
            } else {
                map.put(curr,i);
            }
        }
        return false;
    }
}







    /*


    public boolean containsDuplicate(int[] nums) {

        // Create hashset to store integers
        Set<Integer> intSet = new HashSet<>();

        // Iterate over each element
        for (int num : nums) {

            // Check the number in hashset
            if (intSet.contains(num))
                return true;

            // Add the number to hashset
            intSet.add(num);
        }

        return false;
    }

     */
