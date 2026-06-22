class Solution {
    public double myPow(double x, int n) {
        long binForm = n; 
        double result = 1; 

        if (binForm < 0) {
            x = 1 / x;
            binForm = -binForm;
        }

        while (binForm > 0) {
            if (binForm % 2 == 1) { // yahan last binary didgit check kar rahe hain
                result *= x;
            }

            x *= x;
            binForm /= 2; // yahan right binary digit ko remove kar rahe hain

        }

        return result;
    }
}