public class ArmStrong {
    public static void main(String[] args) {
        for (int i = 100; i < 5000; i++) {
            if (isArmStrong(i)) {
                System.out.println("ArmStrong : " + i);
            }
        }
    }

    static boolean isArmStrong(int org) {
        int sum = 0;
        int digit = org;
        while (org > 0) {
            int temp = org % 10;
            sum += temp * temp * temp;
            org = org / 10;
        }
        return digit == sum;
    }
}
