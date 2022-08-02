package Third;

public class Months {
    enum Season {
        SUMMER, AUTUMN, WINTER, SPRING;
    }

    enum Month {
        JANUARY(Season.WINTER, 31),
        FEBRUARY(Season.WINTER, 28),
        MARCH(Season.SPRING, 31),
        APRIL(Season.SPRING, 30),
        MAY(Season.SPRING, 31),
        JUNE(Season.SUMMER, 30),
        JULY(Season.SUMMER, 31),
        AUGUST(Season.SUMMER, 31),
        SEPTEMBER(Season.AUTUMN, 30),
        OCTOBER(Season.AUTUMN, 31),
        NOVEMBER(Season.AUTUMN, 30),
        DECEMBER(Season.WINTER, 31);

        Season season;
        int daysInMonth;

        Month(Season season, int daysInMonth) {
            this.daysInMonth = daysInMonth;
            this.season = season;
        }

        public Season getSeason() {
            return season;
        }

        public int getDaysInMonth() {
            return daysInMonth;
        }
    }
}
