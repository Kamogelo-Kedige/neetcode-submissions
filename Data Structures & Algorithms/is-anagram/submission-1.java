class Solution {
    
    public boolean isAnagram(String s, String t) {

        // check if they are the same length
        if(s.length() != t.length())
            return false;

        //A hashmap that will store a char(key) & count(value)
        HashMap<Character, Integer> map = new HashMap<>();

        // Add first string to Map
        for(char c : s.toCharArray())
        {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        //Remove from map using the second string, the Map should essentially be empty at the end
        for(char a : t.toCharArray())
        {
            //Check if the key inside t are actually in the map
            if(!map.containsKey(a))
                return false;
            //Remove from the map using 
            map.put(a, map.get(a)-1);
            if(map.get(a)==0)
            {
                map.remove(a);
            }
        }
        
        return map.isEmpty(); // if true then s is an anagram of t and vice versa
    }
}