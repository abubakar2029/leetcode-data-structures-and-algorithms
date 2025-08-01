package _2025_leetcode_contests.march_2025.contest_441;

import java.util.*;

public class Q2_Closest_Equal_Element_Queries {
    class Solution {
        public List<Integer> solveQueries(int[] nums, int[] queries) {
            List<Integer> answers = new ArrayList<>();

            // using index loop for queries to out answers in same index
            for (int i = 0; i < queries.length; i++) {
                int j = i + 1;
                int minDistance = Integer.MIN_VALUE;
                int count = 0;

                // finding index of nums[queries[i]]
                for(int z=0;z<nums.length;z++){
//                    if(nums[z]==)
                }
                while (count<nums.length) {
                    if (j == nums.length)
                        j = 0;
                    if (nums[queries[i]] == nums[j]) {
                        minDistance = count;
                        answers.add(j);
                        break;
                    }
                    j++;
                    count++;
                }
                if (minDistance < 0)
                    answers.add(-1);
            }
            return answers;
        }
    }
}
