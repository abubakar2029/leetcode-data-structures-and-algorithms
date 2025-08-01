package slidingWindow;

import java.util.ArrayList;

public class _480_Sliding_Window_Median {
    private ArrayList<Integer> medianArr = new ArrayList<>();
    double[] temp = {2.22};
    ArrayList<Integer> list = new ArrayList<>();

    public double[] medianSlidingWindow(int[] nums, int k) {

        // first iteration
        for (int i = 0; i < k; i++) {
            list.add(nums[i]);
        }
        collectMedian();

        // sliding the window
        for (int i = k; i < nums.length; i++) {
            list.remove(0);
            list.add(nums[i]);
            collectMedian();
        }
return temp;
    }

    private void collectMedian() {
        // sorting the arrray
        list.sort(null);
        if (list.size() % 2 != 0) {
            medianArr.add((int) list.get((int) (list.size() / 2)));
        } else {
            medianArr.add((int) list.get((int) (list.size() / 2)));
            medianArr.add((int) list.get((int) (list.size() / 2) + 1));
        }
    }
}
