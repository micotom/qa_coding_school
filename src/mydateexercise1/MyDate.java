package mydateexercise1;

import interfaceshomework.ComparableNumber;

public class MyDate implements Comparable<MyDate> {

    public final int dayOfMonth;
    public final MyMonth monthOfYear;
    public final int year;

    public MyDate(int dayOfMonth, MyMonth monthOfYear, int year) {
        if (!isValidDayOfMonth(dayOfMonth, monthOfYear, year)) {
            throw new IllegalArgumentException("Invalid day of month");
        }
        if (!isValidYear(year)) {
            throw new IllegalArgumentException("Invalid year");
        }
        this.dayOfMonth = dayOfMonth;
        this.monthOfYear = monthOfYear;
        this.year = year;
    }

    // TODO equals() + hashCode()
    // TODO use Comparable interface

    @Override
    public String toString() {
        return dayOfMonth + "." + monthOfYear.toInteger() + "." + year;
    }

    @Override
    public int compareTo(MyDate other) {
        if (other.dayOfMonth == dayOfMonth && other.monthOfYear == monthOfYear && other.year == year) {
            return 0;
        }
        // if other is bigger, then return -1
        // if this is bigger, then return 1
    }


    private static boolean isValidDayOfMonth(int dayOfMonth, MyMonth monthOfYear, int year) {
        if (dayOfMonth < 1) {
            return false;
        }
        return dayOfMonth <= monthOfYear.getNumberOfDays(year);
    }

    private static boolean isValidYear(int year) {
        return year >= 0;
    }

}
