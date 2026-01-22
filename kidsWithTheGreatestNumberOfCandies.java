class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        // Finds the greatest # in the array without creating a loop
        // to find it
        int greatestNum = Arrays.stream(candies).max().getAsInt();

        for(int i = 0; i < candies.length; i++){
            // If it's more or equal
            if((candies[i] + extraCandies) >= greatestNum){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }

        return result;

        /*
        - Given: int array candies & int extraCandies
            - each candies[i] represents nthe # of candies the ith kid has
        - n kids w/ candies
        - Return: boolean array result of length n
            - reesult[i] is true if, after giving the ith kid all the
            extraCandies, they'll have the greatest # of candies among all
            the kids
            - otherwise false
        */
    }
}
