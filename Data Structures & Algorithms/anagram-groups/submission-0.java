class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //A map with frequency of chars as key and grouped anagrams as the value
        Map<String,List<String>> groups = new HashMap<>();

        //Iterate over the strings
        for(String s : strs)
        {
            // normalize incase there are UpperCase letters
            s = s.toLowerCase();
            int[] freq = new int[26]; // 26 letters of the alpabet
            //count the frequency of chars using a frequency array
            for(char c : s.toCharArray())
            {
                freq[c - 'a']++; // count the frequencies of each char
            }


            // Save the key as a string for the Map
            String key = Arrays.toString(freq);

            //Each frequency will map to a list of anagrams/ words that match that frequency
            groups.putIfAbsent(key,new ArrayList<>());

            //get values/ words associated with the key and add to list
            groups.get(key).add(s);
            
        }
        // return a new list that contains a collection of all the anagrams
        return new ArrayList<>(groups.values()); 
    }
}
