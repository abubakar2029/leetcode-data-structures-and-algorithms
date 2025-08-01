package set;

import java.util.*;

public class _187_Repeated_DNA_Sequences {
    public static void main(String[] args) {
Solution.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
    }

    static class Solution {
        static public List<String> findRepeatedDnaSequences(String s) {
            Set<String> seen = new HashSet();
            Set<String> repeat = new HashSet();

            for (int i = 0; i < s.length() - 9; i++) {
                String sequence = s.substring(i, i + 10);
                if (seen.contains(sequence)) {
                    repeat.add(sequence);
                } else {
                    seen.add(sequence);
                }
            }
            return new ArrayList(repeat);
        }
    }

}
