package probability;

public class _1227_Airplane_Seat_Assignment_Probability {

    class Solution {
        public double nthPersonGetsNthSeat(int n) {
            return n == 1 ? 1.0 : 0.5;
        }
    }
}
