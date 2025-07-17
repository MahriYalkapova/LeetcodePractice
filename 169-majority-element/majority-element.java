class Solution {
    public int majorityElement(int[] nums) {
        //create a hash table
        HashMap<Integer, Integer> Map = new HashMap<>();

        //iterate through the list
        for (int num : nums) {
            if (!Map.containsKey(num)) {
                Map.put(num, 1);
            } else {
                Map.put(num, Map.get(num) + 1);
            }
        }

        //return majority element
        int max = nums[0];
        for (int key : Map.keySet()) {
            if (Map.get(key) > Map.get(max)) {
                max = key;
            }
        }

        return max;
    }
}

//pseudocode
// create a hash table
// iterate through the list
// if element not in the heap
//     add element to the heap
// if element in the heap
//     key+1

// return the top element
