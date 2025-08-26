package backtracking;

import java.util.*;

public class _77_Combinations {
    public static void main(String[] args) {
        Solution1.combine(4, 2);
    }


    //    My first approach - it's all correct, the bug is there when adding the list in answer set
    static class Solution1 {
        static Set<ArrayList<Integer>> ans = new HashSet();

        static public List<List<Integer>> combine(int n, int k) {
            helper(n, k, new ArrayList<>(), 1);
            return new ArrayList<>(ans);
        }

        static public void helper(int n, int k, ArrayList<Integer> current, int i) {
            if (current.size() == k) {
//                Integer[] list = current.toArray(new Integer[0]);
                ans.add(new ArrayList<>(current)); // ✅ copy before adding
                ans.add(current);
                return;
            }

            if (i > n)
                return;


            current.add(i);
            helper(n, k, current, i + 1);
            current.removeLast();
            helper(n, k, current, i + 1);
        }
    }
}
