import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números na sequência: ");
        int count = scanner.nextInt();

        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Digite um número: ");
            int number = scanner.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }
        }

        System.out.println("Quantidade de números positivos: " + positiveCount);
        System.out.println("Quantidade de números negativos: " + negativeCount);

        scanner.close();
    }
}
