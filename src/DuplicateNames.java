import java.util.*;

public class DuplicateNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> namesList = new ArrayList<>();
        Set<String> uniqueNames = new HashSet<>();
        Set<String> duplicateNames = new HashSet<>();

        System.out.println("Digite os nomes (digite 'sair' para finalizar):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("sair")) {
                break;
            }
            if (!uniqueNames.add(name)) {
                duplicateNames.add(name);
            }
            namesList.add(name);
        }

        System.out.println("Nomes que apareceram mais de uma vez:");
        for (String name : namesList) {
            if (duplicateNames.contains(name)) {
                System.out.println(name);
                duplicateNames.remove(name); // To avoid printing duplicates if a name occurs more than twice
            }
        }

        scanner.close();
    }
}
