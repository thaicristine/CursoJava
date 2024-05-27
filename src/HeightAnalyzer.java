import java.util.Scanner;

public class HeightAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] heights = new float[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a altura da pessoa " + (i + 1) + " (em metros): ");
            heights[i] = scanner.nextFloat();
        }

        float tallest = heights[0];
        float shortest = heights[0];
        for (int i = 1; i < 5; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }

        System.out.println("A pessoa mais alta tem " + tallest + " metros de altura.");
        System.out.println("A pessoa mais baixa tem " + shortest + " metros de altura.");

        scanner.close();
    }
}
