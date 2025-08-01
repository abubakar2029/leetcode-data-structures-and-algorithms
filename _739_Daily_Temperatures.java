import java.util.*;


class _739_Daily_Temperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int targetIndex = stack.pop();
                answer[targetIndex] = i - targetIndex;
            }
            stack.push(i);
        }
        return answer;
    }
}
