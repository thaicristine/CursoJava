import java.util.Scanner;

public class MusicalNoteTranslation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma nota musical (A, B, C, D, E, F ou G): ");
        String note = scanner.nextLine().toUpperCase();

        String translation;

        switch (note) {
            case "A":
                translation = "Lá";
                break;
            case "B":
                translation = "Si";
                break;
            case "C":
                translation = "Dó";
                break;
            case "D":
                translation = "Ré";
                break;
            case "E":
                translation = "Mi";
                break;
            case "F":
                translation = "Fá";
                break;
            case "G":
                translation = "Sol";
                break;
            default:
                translation = "Nota inválida";
                break;
        }
        System.out.println("A tradução da nota " + note + " é: " + translation);

        scanner.close();
    }
}
