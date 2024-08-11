public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,2};
        System.out.println(search(arr,0,3));
    }

    private static int search(int[] arr, int index, int target) {
        if (index==arr.length-1)return -1;
        if (arr[index]==target)return index;
        return search(arr,++index,target);
    }
}
