import java.util.Arrays;

public class _189_Rotate_Array {

    public static void main(String[] args) {
        Solution2.rotate(new int[]{-1, -100, 3, 99}, 2);
    }
}

//    Time limit exceeded
class Solution1 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            int temp = nums[n - 1];
            for (int j = n - 1; j >= 1; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }
}

//        By making copy of array
class Solution2 {
    static public void rotate(int[] nums, int k) {
        int n = nums.length;
//        int[] temp = new int[n];
        int[] temp = nums.clone();

//                pehla loop 'k' sa 'n' tk
        for (int i = k; i < n; i++) {
            nums[i] = temp[i - k];
        }
        System.out.println(Arrays.toString(nums));
//    dosra loop '0' sa 'k' tk, bcz k include ho gaya ha already
        for (int i = 0; i < k; i++) {
            nums[i] = temp[n - k + i];
        }
        System.out.println(Arrays.toString(nums));
    }


}

