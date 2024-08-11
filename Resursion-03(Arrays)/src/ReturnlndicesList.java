import java.util.ArrayList;

public class ReturnlndicesList {
    public static void main(String[] args) {
        int[] arr={1,2,3,2};
        System.out.println(findIndices(arr,0,2,new ArrayList<Integer>()));
    }

    private static ArrayList<Integer> findIndices(int[] arr, int index, int target,ArrayList<Integer>list) {
        if (index==arr.length)return list;
        if (arr[index]==target)list.add(index);
        return findIndices(arr,++index,target,list);
    }
}
