class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // Array holding arrays of the combinations
        List<List<Integer>> result = new ArrayList<>();

        // Looking through the combinations using backtracking,
        // so every comnination is looked through,
        // even the same numbers
        backtrack(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int[] candidates, int remaining, int start, List<Integer> path, List<List<Integer>> result){
        // Once it reached its target
        if(remaining == 0){
            result.add(new ArrayList<>(path));
            return;
        }

        // Over the target
        if(remaining < 0){
            return;
        }

        for(int i = start; i < candidates.length; i++){
            // Choose
            path.add(candidates[i]);
            backtrack(candidates, remaining - candidates[i], i, path, result);
            // Backtrack
            path.remove(path.size() - 1);
        }
    }
}
