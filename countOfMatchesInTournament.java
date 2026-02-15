class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;

        // Once n = 1, the winner is declared
        while(n != 1){
            // No matter whether teams # is
            // even or odd, the matches math
            // is always the same
            matches += n / 2;

            // If even
            if(n % 2 == 0){
                n = (n / 2);
            }
            // If odd
            else{
                n = (n / 2) + 1;
            }
        }

        return matches;
        
        /*
        - Given: int n (# of teams in a
        trournament that has strange rules)
            - If even, each team gets
            paired w/ another team
                - Total of n/2 matches are
                played 
                - n/2 advance to the next
                round
            - If odd, 1 team randomly
            advances in the tournament, the
            rest gets paired
                - Total of (n - 1)/2 matches
                are played
                - (n - 1) / 2 + 1 teams
                advance to the next round
        - Return: # of matches played in the
        tournament until a winner is decided
        */
    }
}
