import java.util.Scanner;

public class TenNumbersAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        System.out.println("A média dos 10 números é: " + average);

        scanner.close();
    }
}
