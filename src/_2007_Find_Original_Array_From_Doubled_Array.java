import java.util.*;

public class _2007_Find_Original_Array_From_Doubled_Array {

    public static void main(String[] args) {
        _2007_Find_Original_Array_From_Doubled_Array parent = new _2007_Find_Original_Array_From_Doubled_Array();
        Solution solution = parent.new Solution();
        solution.findOriginalArray(new int[]{6, 3, 0, 1});
    }

    //    correct - hashmap
    class Solution {
        public int[] findOriginalArray(int[] changed) {
            if (changed.length % 2 != 0)
                return new int[]{};

            Map<Integer, Integer> table = new HashMap();
            for (int num : changed) {
                table.put(num, table.getOrDefault(num, 0) + 1);
            }

            Arrays.sort(changed);

            ArrayList<Integer> list = new ArrayList();
            for (int num : changed) {
                if (table.containsKey(num * 2) && table.get(num * 2) > 0 && table.get(num) > 0) {
                    if (num == 0 && table.get(num) <= 1)
                        continue;

                    list.add(num);
                    table.put(num, table.get(num) - 1);
                    table.put(num * 2, table.get(num * 2) - 1);
                }
            }

            if (list.size() == changed.length / 2) {
                int[] result = new int[list.size()];
                for (int i = 0; i < result.length; i++) {
                    result[i] = list.get(i);
                }
                return result;
            } else
                return new int[]{};
        }
    }


    //    passed 133 testcases - stuck on  0 0 0 0
    class Solution1 {
        public int[] findOriginalArray(int[] changed) {
            // edge case - not a doubled array
            if (changed.length % 2 != 0)
                return new int[]{};

            Set<Integer> set = new HashSet();
            for (int num : changed) {
                set.add(num);
            }

            ArrayList<Integer> org = new ArrayList();
            for (int num : changed) {
                if (set.contains(num * 2) && num != 0) {
                    org.add(num);
                    set.remove(num);
                    set.remove(num * 2);
                }
            }
            if (org.size() == changed.length / 2) {
                int[] result = new int[org.size()];
                for (int i = 0; i < org.size(); i++) {
                    result[i] = org.get(i);
                }
                return result;
            } else {
                return new int[]{};
            }

        }
    }
}
