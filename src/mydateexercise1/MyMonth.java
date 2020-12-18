package mydateexercise1;

public enum MyMonth {

    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31)
    ;

    private final int nrOfDays;

    MyMonth(int nrOfDays) {
        this.nrOfDays = nrOfDays;
    }

    public int toInteger() {
        MyMonth[] allMonths = MyMonth.values();
        int index = -1;
        for (MyMonth month : allMonths) {
            ++index;
            if (month == this) {
                break;
            }
        }
        return (index + 1);
    }

    public int getNumberOfDays(int year) {
        if (this != FEBRUARY) {
            return nrOfDays;
        } else {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return nrOfDays;
            }
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 200 != 0);
    }

}
