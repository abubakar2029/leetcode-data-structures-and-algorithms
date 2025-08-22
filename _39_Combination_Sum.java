import java.util.*;

public class _39_Combination_Sum {


//    My first intuition
    // outer_loop
    // left, right

    // check if i+l-t == l || i+l-t==i
    // -> add it's subset and continue

    // enter while loop
    // calculate sum
    // if sum == target
    // -> add it's subset and continue
    //
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList<>();
            backtrack(candidates, target, 0, new ArrayList<>(), result);
            return result;
        }

        private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
            if (target == 0) {
                result.add(new ArrayList<>(current));
                return;
            }

            for (int i = start; i < candidates.length; i++) {
                if (candidates[i] <= target) {
                    current.add(candidates[i]);
                    backtrack(candidates, target - candidates[i], i, current, result); // not i+1 because we can reuse same number
                    current.remove(current.size() - 1);
                }
            }
        }
    }

}
