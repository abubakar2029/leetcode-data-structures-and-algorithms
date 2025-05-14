package set;

import java.util.*;

public class _2215_Find_the_Difference_of_Two_Arrays {
    class Solution {
        public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            // making one set for each array
            Set<Integer> set1 = new HashSet();
            Set<Integer> set2 = new HashSet();

            // populating both sets with their numbers
            for (int num : nums1) {
                set1.add(num);
            }

            for (int num : nums2) {
                set2.add(num);
            }

            System.out.println(set1);
            System.out.println(set2);

            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList();

            // adding unique elements in both lists
            for (Integer num : set1) {
                if (!set2.contains(num))
                    list1.add(num);
            }
            for (Integer num : set2) {
                if (!set1.contains(num))
                    list2.add(num);
            }

            List<List<Integer>> ans = new ArrayList<>();
            ans.add(list1);
            ans.add(list2);
            return ans;
        }
    }
}
