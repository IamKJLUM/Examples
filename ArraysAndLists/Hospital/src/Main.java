import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите кол-во пациентов:");
            int input = new Scanner(System.in).nextInt();
            float[] temperatureData = Hospital.generatePatientsTemperatures(input);
            System.out.println(Hospital.getReport(temperatureData));
        }
    }
}
