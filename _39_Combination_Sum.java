import java.util.*;

public class _39_Combination_Sum {

    public static void main(String[] args) {
        Solution2.combinationSum(new int[]{2, 3, 6, 7}, 7);
    }

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

    static class Solution2 {
        static  Set<List<Integer>> set = new HashSet();

        static public List<List<Integer>> combinationSum(int[] candidates, int target) {

            allCombinations(candidates, 0, target, new ArrayList<Integer>());
            return new ArrayList<List<Integer>>(set);
        }

        static public void allCombinations(int[] arr, int start, int target, ArrayList<Integer> current) {
            // I check if target is completed
            if (target == 0) {
                // if (set.contains(current)) {
                set.add(new ArrayList<>(current));
                // }
                return;
            }

            // I check if it goes smaller than target
            if (target < 0 || start >= arr.length)
                return;

            // I include the element
            current.add(arr[start]);
            // sigle included call
            allCombinations(arr, start + 1, target - arr[start], current);
            // same element call
            allCombinations(arr, start, target - arr[start], current);
            current.remove(current.size() - 1);
            // excluding the element
            allCombinations(arr, start + 1, target , current);
        }
    }

    class Solution1 {
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
