import java.util.Scanner;

public class CountRepeatedValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Digite 10 números inteiros separados por espaços:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] occurrences = new int[10];
        for (int number : numbers) {
            occurrences[number]++;
        }

        System.out.println("Números repetidos:");
        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] > 1) {
                System.out.println("O número " + i + " aparece " + occurrences[i] + " vezes.");
            }
        }

        scanner.close();
    }
}
