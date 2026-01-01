class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Edge case
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        int i = 0;
        while(i < s.length()){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // If sChar has already been mapped, it must have already mapped
            // to tChar
            if(sMap.containsKey(sChar) && sMap.get(sChar) != tChar){
                return false;
            }

            // Same thing for this
            // If tChar has already been mapped, it must have already
            // mapped to sChar
            if(tMap.containsKey(tChar) && tMap.get(tChar) != sChar){
                return false;
            }

            // Mapping goes both ways
            sMap.put(sChar, tChar);
            tMap.put(tChar, sChar);

            i++;
        }

        return true;

        /*char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        int j = 1;
        for(int i = 0; i < s.length(); i++){
            if(j >= s.length()){
                break;
            }
            if(sChar[i] == sChar[j]){
                if(tChar[i] == tChar[j]){
                    j++;
                }
                else{
                    return false;
                }
            }
            else{

            }
            j++;
            /*if(sChar[i] != sChar[j]){
                if(tChar[i] != tChar[j]){
                    j++;
                }
                else{
                    return false;
                }
            }
        }

        return true; */

        /*int[] sFreq = new int[26];
        int[] tFreq = new int[26];

        for(char sF : s.toCharArray()){
            sFreq[sF - 'a']++;
        }
        for(char tF : t.toCharArray()){
            tFreq[tF - 'a']++;
        }

        // Edge case
        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < t.length(); i++){
            if(sFreq[i] != tFreq[i]){
                return false;
            }
            /*else{
                //sFreq[i]--;
                //tFreq[i]--;

                if(sFreq[i] > 1){
                    i--;
                }
            }
        }

        return true;*/
        /*
        - Given: 2 strings s & t
        - Isomorphic if the characters in s can be replaced to get t

        2 HashMaps?
        or 1 HashMap for s, and check the frequency of the letters for t
        Would a HashMap even be necessary? a freq array for t and one for s
        The letter doesn't even matter, it's all about the frequency

        Unsure how to do the freq array properly

        2 HashMaps
        One to one char mapping
        Tracking reverse mapping too, so 2 chars don't map to the same one
        Will return false if there is mapping conflicts
        */
    }
}
