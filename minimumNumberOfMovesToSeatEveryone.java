class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int minMoves = 0;

        // Sorts the arrays first since trying to find the
        // closest seat to each student, instead of doing
        // my first apprach, which was a nested loop, which
        // was a greedy algo
        Arrays.sort(seats);
        Arrays.sort(students);

        // Adds the differences of the student and the closest
        // seat to them to the sum of total moves
        for(int i = 0; i < seats.length; i++){
            minMoves += Math.abs(seats[i] - students[i]);
        }

        return minMoves;

        /*
        - n available seats & n students standing in a room
        - Given: int array seats of length n
            - students[j] is the position of jth student
        Move: increase or decrease the position of the ith
        student by 1
        Return: min # of moves required to move each student
        to a seat such that no 2 students are in the same seat

        Probably a nested loop from what I'm seeing right now
        Not sure if there's a more efficient route

        Ex. seats = [2, 2, 6, 6] & students = [1, 3, 2, 6]
        i = 0
        closestSeats = 2 - 1 = 1
        j = 0
        if(1 <= 1)
            closestSeats = 1;
            l = 0;
        j = 1
        if(1 <= 1)
            closestSeats = 1
            l = 1
        j = 2
        if 0 <= 1
            closestSeats = 0
            l = 2

        tmp = 2
        seats[2] = 1
        seats[i] = 2
        [2, 3, 1, 2, 6]

        minMoves = 0

        Okay, wait, a nested loop is a bad approach because it's
        a greedy approach, which will not get me the minimum total
        moves
        If I sort both arrays first though
        */
    }
}
