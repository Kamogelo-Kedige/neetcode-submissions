class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        //first put the values and their indices into a map
        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i],i);
        }

        //try to find the complement from the map

        for(int i = 0; i < nums.length; i++)
        {
            int complement = target - nums[i];

            if(map.containsKey(complement) && (map.get(complement)!= i))
            {
                return new int[] {i,map.get(complement)};
            }
        }

       
       return new int[] {-1,-1}; // should never reach here eseentially
    }
}
