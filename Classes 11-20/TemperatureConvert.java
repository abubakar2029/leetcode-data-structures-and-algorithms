import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        System.out.print("Enter temperature in Celcius : ");
        Scanner input = new Scanner(System.in);
        double celcuis = input.nextDouble();
        System.out.println("Farenheit : " + ((9 / 5 * celcuis) + 32));

    }
}
