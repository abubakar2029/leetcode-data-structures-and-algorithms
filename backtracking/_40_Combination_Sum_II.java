package backtracking;

import java.util.*;

public class _40_Combination_Sum_II {
    public static void main(String[] args) {

    }


    class Solution {
        List<List<Integer>> res = new ArrayList<>();

        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates); // sort for duplicate handling
            dfs(candidates, 0, target, new ArrayList<>());
            return res;
        }

        private void dfs(int[] nums, int index, int remain, List<Integer> path) {
            if (remain == 0) {
                res.add(new ArrayList<>(path));
                return;
            }
            if (index >= nums.length || remain < 0) return;

            // Option 1: take this number
            path.add(nums[index]);
            dfs(nums, index + 1, remain - nums[index], path);
            path.remove(path.size() - 1);

            // Option 2: skip all duplicates of this number
            int next = index + 1;
            while (next < nums.length && nums[next] == nums[index]) {
                next++;
            }
            dfs(nums, next, remain, path);
        }
    }

}
