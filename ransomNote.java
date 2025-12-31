class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Only turn ransomNote into a char array since the chars
        // in magazine will be put into a HashMap
        char[] ransomNoteChar = ransomNote.toCharArray();

        HashMap<Character, Integer> magazineMap = new HashMap<>();

        for(char c : magazine.toCharArray()){
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        int i = 0;/*
          0    1
        ["a", "a"]
        length = 2
        i = 0
        ransomNoteChar[0] = "a"
        magazineMap = {["a", 1], ["b", 1]}
        
        magazineMap = {["a", 0], ["b", 1]}
        i = 1

        i < 2
        */
        while(i < ransomNote.length()){
            if(magazineMap.containsKey(ransomNoteChar[i])){
                int count = magazineMap.get(ransomNoteChar[i]);
                magazineMap.put(ransomNoteChar[i], count - 1);
                if(count <= 0){
                    return false;
                }
                i++;
            }
            else{
                return false;
            }
        }

        return true;

        /*
        Given: 2 strings ransomNote & magazine
        Return: true if ransomNote can be constructed by using the
        letters from magazine
        false otherwise

        Trying to have a full understanding of HashMaps for this section
        map.getOrDefault(_, _)
        If it can't get a value, then defaults to the 2nd parameter
        put(key, value)
        inserting or updating
        get(object key)
        retrieving value assocciated w/ a specific key
        */
    }
}
