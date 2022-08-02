package first;

public class Functions {
    public static void menu() {
        System.out.println("\nВведіть '1' якщо хочете перевірити чи існує такий місяць");
        System.out.println("Введіть '2' якщо хочете взнати місяці з такою ж порою року");
        System.out.println("Введіть '3' якщо хочете взнати місяці з такою ж к-стю днів");
        System.out.println("Введіть '4' якщо хочете взнати місяці з меншою к-стю днів ніж у даному");
        System.out.println("Введіть '5' якщо хочете взнати місяці з більшою к-стю днів ніж у даному");
        System.out.println("Введіть '6' якщо хочете взнати наступну пору року");
        System.out.println("Введіть '7' якщо хочете взнати попередню пору року");
        System.out.println("Введіть '8' якщо хочете взнати місяці у яких к-сть днів парна");
        System.out.println("Введіть '9' якщо хочете взнати місяці у яких к-сть днів непарна");
        System.out.println("Введіть '10' якщо хочете перевірити місяць на парну к-сть днів\n");
        System.out.print("Enter: ");
    }
    public static boolean checkMonth(String enteredMonth) throws Exception {
        for (Months.Month month : Months.Month.values()) {
            if (enteredMonth.equals(month.name())) {
                System.out.println("\nChecker: місяць існує\n");
                return true;
            }
        }
        System.out.println("Перевірте правильність написання, та спробуйте ще раз");
        throw new WrongInputConsoleParametersException("Error");
    }
    public static boolean checkSeason(String enteredSeason) throws Exception {
        for (Months.Season season : Months.Season.values()) {
            if (enteredSeason.equals(season.name())) {
                System.out.println("\nChecker: сезон існує\n");
                return true;
            }
        }
        System.out.println("Перевірте правильність написання, та спробуйте ще раз");
        throw new WrongInputConsoleParametersException("Error");
    }
}
