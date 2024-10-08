class Solution {
    public int[] twoSum(int[] nums, int target) {

        /**brute force
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        **/

        /** HashMap
         if map contains target - num[i]
         return [i, map.get(target - nums[i])]
         otherwise, put nums[i] and i into map
        **/
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
