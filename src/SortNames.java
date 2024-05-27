import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o  " + (i + 1) + "º nome: ");
            names[i] = scanner.nextLine();
        }

        for (int i = 0; i < 5 - 1; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        System.out.println("Nomes em ordem crescente:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
