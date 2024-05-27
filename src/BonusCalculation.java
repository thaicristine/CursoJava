import java.util.Scanner;

public class BonusCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário base do funcionário: ");
        double baseSalary = scanner.nextDouble();

        System.out.print("Digite o número de anos de serviço do funcionário: ");
        int yearsOfService = scanner.nextInt();

        // Variable to store the bonus
        double bonus;

        // Calculate the bonus according to the rules
        if (yearsOfService > 5) {
            bonus = baseSalary * 0.05;
        } else {
            bonus = baseSalary * 0.02;
        }

        // Display the bonus amount
        System.out.println("O bônus salarial é: R$ " + bonus);

        // Close the scanner
        scanner.close();
    }
}
