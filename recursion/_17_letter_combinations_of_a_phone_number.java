public class _17_letter_combinations_of_a_phone_number {
    class Solution {
        Map<Character, List<String>> dict = Map.of(
                '2', List.of("a", "b", "c"),
                '3', List.of("d", "e", "f"),
                '4', List.of("g", "h", "i"),
                '5', List.of("j", "k", "l"),
                '6', List.of("m", "n", "o"),
                '7', List.of("p", "q", "r", "s"),
                '8', List.of("t", "u", "v"),
                '9', List.of("w", "x", "y", "z"));

        public List<String> letterCombinations(String digits) {
            List<String> result = new ArrayList();
            helper("", digits, result);
            return result;
        }

        public void helper(String previous, String digits, List<String> result) {
            if (digits == null || digits.length() == 0) {
                result.add(previous);
                return;
            }

            char digit = digits.charAt(0);
            digits = digits.substring(1);

            for (String ch : dict.get(digit)) {
                helper(previous + ch, digits, result);
            }
        }
    }
}
