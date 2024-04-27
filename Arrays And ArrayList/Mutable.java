
public class Mutable {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 55 };
        System.out.println("Before : " + nums[0]);
        change(nums);
        System.out.println("After : " + nums[0]);

        // this is bcz reference was passed to function
    }

    static void change(int[] arr) {
        arr[0] = 99;
    }
}
