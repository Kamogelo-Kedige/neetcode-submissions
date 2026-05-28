class Solution {
    public boolean isPalindrome(String s) {
        //make the input case insensitive and remove non-alphanumeric characters
        String pali = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0; // left pointer
        int right = pali.length() -1 ; // right pointer

        while(left < right)
        {
            // if at any point the characters dont match its not a valid palindrome
            if(pali.charAt(left) != pali.charAt(right))
                return false;

            left++; // move inward from the left
            right--; // move inward from the right
        }

        return true;
    }
}