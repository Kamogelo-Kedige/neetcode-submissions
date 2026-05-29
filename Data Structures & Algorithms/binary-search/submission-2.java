class Solution {
    public int search(int[] nums, int target) {
        
        //left pointer
        int left = 0;
        //right pointer
        int right = nums.length - 1;

        while(left <= right)
        {

            int mid = ((left + right))/ 2; // get the array middle, bias right

            if(nums[mid] == target)
            {
                return mid;
            }else if(target < nums[mid])
            {
                // move the end pointer to one less that the previous middle
                right = mid - 1;
            }else if(target > nums[mid])
            {
                //move left pointer to one more than the mid
                left = mid + 1;
            }
        }

        return -1;
    }
}
