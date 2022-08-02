package first;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String Entered_Month;
        String Entered_Season;
        while (true) {
            boolean flag;
            Functions.menu();
            Months.Season [] mas_s = Months.Season.values();
            int Number = scanner.nextInt();
            switch (Number) {

                case 1:
                    System.out.print("Введіть назву місяця латинецею: ");
                    Entered_Month = scanner.next().toUpperCase();
                    flag = Functions.checkMonth(Entered_Month);
                    break;
                case 2:
                    System.out.print("Введіть назву місяця латинецею: ");
                    Entered_Month = scanner.next().toUpperCase();
                    if (Functions.checkMonth(Entered_Month)) {
                        System.out.println("Місяці з тією ж порою року:");
                        for (Months.Month month : Months.Month.values()){
                            if (month.getSeason().name().equals(Months.Month.valueOf(Entered_Month).getSeason().name())) {
                                System.out.println(month.name());
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.print("Введіть назву місяця латинецею: ");
                    Entered_Month = scanner.next().toUpperCase();
                    if (Functions.checkMonth(Entered_Month)) {
                        System.out.println("Місяці з тією ж к-стю днів:");
                        for (Months.Month month : Months.Month.values()) {
                            if(month.getDaysInMonth() == Months.Month.valueOf(Entered_Month).getDaysInMonth()) {
                                System.out.println(month.name());
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.print("Введіть назву місяця латинецею: ");
                    Entered_Month = scanner.next().toUpperCase();
                    if (Functions.checkMonth(Entered_Month)) {
                        System.out.println("Місяці з меншою к-стю днів:");
                        for (Months.Month month : Months.Month.values()) {
                            if(month.getDaysInMonth() < Months.Month.valueOf(Entered_Month).getDaysInMonth()) {
                                System.out.println(month.name());
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.print("Введіть назву місяця латинецею: ");
                    Entered_Month = scanner.next().toUpperCase();
                    if (Functions.checkMonth(Entered_Month)) {
                        System.out.println("Місяці з більшою к-стю днів:");
                        for (Months.Month month : Months.Month.values()) {
                            if(month.getDaysInMonth() > Months.Month.valueOf(Entered_Month).getDaysInMonth()) {
                                System.out.println(month.name());
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.print("Введіть назву сезону латинецею: ");
                    Entered_Season = scanner.next().toUpperCase();
                    if (Functions.checkSeason(Entered_Season)) {
                        System.out.println("Наступний сезон це: ");
                        int a = Months.Season.valueOf(Entered_Season).ordinal();
                        if (a == (Months.Season.values().length - 1)) {
                            a = 0;
                            System.out.println(mas_s[a]);
                        }
                        else {
                            System.out.println(mas_s[a + 1]);
                        }
                    }
                    break;
                case 7:
                    System.out.print("Введіть назву сезону латинецею: ");
                    Entered_Season = scanner.next().toUpperCase();
                    if (Functions.checkSeason(Entered_Season)) {
                        int a = Months.Season.valueOf(Entered_Season).ordinal();
                        if (a == 0) {
                            a = Months.Season.values().length - 1;
                            System.out.println(mas_s[a]);
                        }
                        else {
                            System.out.println(mas_s[a - 1]);
                        }
                    }
                    break;
                case 8:
                    System.out.println("Місяці з парною к-стю днів:");
                    for (Months.Month month : Months.Month.values()) {
                        if (month.getDaysInMonth() % 2 == 0)
                            System.out.println(month.name());
                    }
                    break;
                case 9:
                    System.out.println("Місяці з непарною к-стю днів:");
                    for (Months.Month month : Months.Month.values()) {
                        if (month.getDaysInMonth() % 2 != 0)
                            System.out.println(month.name());
                    }
                    break;
                case 10:
                    System.out.print("Введіть назву місяця латинецею: ");
                    Entered_Month = scanner.next().toUpperCase();
                    if (Functions.checkMonth(Entered_Month)) {
                        if (Months.Month.valueOf(Entered_Month).getDaysInMonth() % 2 == 0) {
                            System.out.println("Місяць" + Months.Month.valueOf(Entered_Month).name() + " є парним");
                        }
                        else {
                            System.out.println("Місяць " + Months.Month.valueOf(Entered_Month).name() + " є не парним");
                        }
                    }
                    break;
            }
        }
    }
}
