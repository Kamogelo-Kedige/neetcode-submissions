class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        Arrays.sort(numbers);
        
        int left = 0; // Left pointer
        int right = numbers.length - 1; // right pointer

        while(left < right)
        {
            // add the numbers
            int sum = numbers[left] + numbers[right];
            if(sum == target)
            {
                return new int[]{++left,++right}; // one indexed, increment before returing
            }else if(sum < target)
            {
                // move inward to bigger numbers, which will increase the sum
                left++; 
            }
            else
            {
                //if sum> target, move inward to smaller numbers that will reduce the sum
                right--;
            }
        }

        return new int[] {-1,-1}; // Should never reach here
    }
}
