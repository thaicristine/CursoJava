import java.util.Scanner;

public class AnnualCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o dia da semana inicial (1 para domingo, 2 para segunda-feira, ..., 7 para sábado): ");
        int startingDayOfWeek = scanner.nextInt();
        scanner.close();

        System.out.println("Calendário Anual para " + year);
        System.out.println("===========================");

        for (int month = 1; month <= 12; month++) {
            System.out.println();
            System.out.println(getMonthName(month) + " " + year);
            System.out.println("---------------------------");
            System.out.println(" Dom Seg Ter Qua Qui Sex Sáb");

            int startingDayOfMonth = getStartingDayOfMonth(year, month, startingDayOfWeek);

            int day;
            for (day = 1; day <= startingDayOfMonth; day++) {
                System.out.print("    ");
            }
            for (; day <= getDaysInMonth(year, month); day++) {
                System.out.printf("%4d", day);
                startingDayOfMonth++;
                if (startingDayOfMonth % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        }
    }

    private static String getMonthName(int month) {
        String[] monthNames = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return monthNames[month - 1];
    }

    private static int getStartingDayOfMonth(int year, int month, int startingDayOfWeek) {
        int totalDays = getTotalDays(year, month);
        int startingDayOfYear = (totalDays + startingDayOfWeek - 1) % 7;
        return (startingDayOfYear == 0) ? 7 : startingDayOfYear;
    }

    private static int getTotalDays(int year, int month) {
        int totalDays = 0;
        for (int i = 1; i < month; i++) {
            totalDays += getDaysInMonth(year, i);
        }
        return totalDays;
    }

    private static int getDaysInMonth(int year, int month) {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else {
            return 31;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
