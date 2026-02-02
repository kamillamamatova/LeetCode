class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int verticalArea = 0;

        // An int array only for x coordinates
        int[] xs = new int[points.length];
        // Fills out the x array with only x coordinates
        // from the points 2D grid
        for(int i = 0; i < points.length; i++){
            xs[i] = points[i][0];
        }

        // Sorts the x's so they're in increasing order
        // so when finding differences, the points in
        // between point won't be a problem
        Arrays.sort(xs);

        // Finds the max vertical distance, by comparing
        // the differences of the current vertical area,
        // to the difference bettween the previous x
        // coordinate and the current one
        for(int i = 1; i < points.length; i++){
            verticalArea = Math.max(verticalArea, xs[i] - xs[i - 1]);
        }

        return verticalArea;

        /*
        - Given: n points on a 2D plane
            - points[i] = [xi, yi]
        - Return: widest vertical area betweeen the 2
        points such that no points are inside the area

        I don't see how the y point even matters, because
        in ex. 2, the y points weren't = to eachtother
        to create the distance 3
        */
    }
}
