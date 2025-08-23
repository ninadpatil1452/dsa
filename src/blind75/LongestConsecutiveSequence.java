package blind75;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    /*
    Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
    You must write an algorithm that runs in O(n) time.
    Input: nums = [100,4,200,1,3,2]
    Output: 4
    Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore, its length is 4.
     */
    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();

        for(int num : nums) {
            hashSet.add(num);
        }
        int max = 0;

        for(int i = 0; i < nums.length; i++) {

            if(!hashSet.contains(nums[i] - 1)) {
                int current = nums[i];
                int count = 1;
                while(hashSet.contains(current + 1)) {
                    count++;
                    current = current + 1;
                    hashSet.remove(current);
                }
                max = Math.max(max, count);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}
