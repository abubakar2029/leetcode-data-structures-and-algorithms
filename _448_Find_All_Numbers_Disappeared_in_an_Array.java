public class _448_Find_All_Numbers_Disappeared_in_an_Array {
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> missingIntegers = new ArrayList();

            // adding all the elements in the set - it will not include duplicates
            Set<Integer> list = new HashSet();
            for (int num : nums) {
                list.add(num);
            }

            // making the list of missing Integers
            for (int i = 0; i < nums.length; i++) {
                if (!list.contains(i + 1)) {
                    missingIntegers.add(i + 1);
                }
            }

            return missingIntegers;
        }
    }
}
