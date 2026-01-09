class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> friendsSet = new HashSet<>();

        int[] finishingOrder = new int[friends.length];

        // Puts all the #s in friends into the new hashset
        for(int f : friends){
            friendsSet.add(f);
        }

        // For the finishing order array
        int j = 0;
        for(int i = 0; i < order.length; i++){
            // If the hashset contains a # in the order,
            // then it gets placed in the finishingOrder array
            if(friendsSet.contains(order[i])){
                finishingOrder[j] = order[i];
                j++;
            }
        }

        return finishingOrder;

        /*
        - Given: int array order of length n & int array friends
            - order has every int 1 to n exactly once
            - friends 

        Hashset?
        */
    }
}
