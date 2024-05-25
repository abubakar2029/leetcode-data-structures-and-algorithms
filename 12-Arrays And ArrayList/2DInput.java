import java.util.Scanner;

public class 2DInput {
    public static void main(){
        Scanner in = new Scanner(System.in);

        int[][] arr2D=new int[3][3];
        for (int i = 0; i < arr2D.length; i++) {
            // for each col in every row
            for (int col = 0; col < arr2D[i].length; col++) {
                arr2D[i][col]=in.nextInt();
            }
        }
        in.close();
    }
}
