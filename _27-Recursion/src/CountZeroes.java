public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(countZeroes(20403));
    }
    static int countZeroes(int n){
        return helper(n,0);
    }
    static int helper(int n,int zeroCounter){
        if (n<1)return zeroCounter;
        int remainder=n%10;
        if (remainder==0)++zeroCounter;
        return  helper(n/10,zeroCounter);
    }
}
