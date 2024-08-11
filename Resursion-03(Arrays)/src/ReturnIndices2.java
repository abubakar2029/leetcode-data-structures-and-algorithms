import java.util.ArrayList;

public class ReturnIndices2 {
    public static void main(String[] args) {
        int[] arr={2,1,2,3,2};
        System.out.println(findIndices(arr,0,2));
    }

    private static ArrayList<Integer> findIndices(int[] arr, int index, int target) {
        ArrayList<Integer> list=new ArrayList<>();
        if (index==arr.length)return list;
        if (arr[index]==target)list.add(index);
        list.addAll(findIndices(arr,++index,target));
        return list;
    }
}
