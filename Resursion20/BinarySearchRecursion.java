public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int index=search(a, 0, a.length - 1, 7);
        System.out.println(a[index]);
    }

    static int search(int[] a, int start, int end, int target) {
        int mid = start + (end - start) / 2;
        if (target == a[mid]) return mid;
        if (start > end) return -1;
        return target > a[mid] ?  search(a, mid + 1, end, target) : search(a, start, mid - 1, target);
    }

}
