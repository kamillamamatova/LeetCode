class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> returnList = new ArrayList<>();
        // Will be used to check if an i has already been added to
        // returnList
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < groupSizes.length; i++){
            // Skips the rest if it already contains i
            // so basically i++
            if(set.contains(i)){
                continue;
            }

            // Needs to reset for each new group
            List<Integer> inList = new ArrayList<>();

            // Starts off at i bececause the ones before would have been added by now
            for(int j = i; j < groupSizes.length && inList.size() < groupSizes[i]; j++){
                if(groupSizes[j] == groupSizes[i]){
                    inList.add(j);
                    set.add(j);
                }
            }

            returnList.add(inList);
        }

        return returnList;

        /*
        - n ppl split into some unknown # of groups\
            - Each person is labeled w/ a unique ID from 0 to n - 1
        - Given: int array groupSizes
            - groupSizes[i] is the size of the group that person i
            is in
        - Return: list of groups that each person i is in a group
        of size groupSizes[i]
        - Each person should appear in exactly one group, & every
        person must be in a group

        so a double arraylist
        Okay so if groupSizes[i] = idk, then the group its in needs
        to be of size 3
        */
    }
}
