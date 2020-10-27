package interfaceshomework;

public class MyNumber1 implements ComparableNumber {

    public final int number;

    public MyNumber1(int number) {
        this.number = number;
    }

    @Override
    public boolean isEquals(ComparableNumber other) {
        return other.getNumber().doubleValue() == this.getNumber().doubleValue();
    }

    @Override
    public boolean isBigger(ComparableNumber other) {
        return this.getNumber().doubleValue() > other.getNumber().doubleValue();
    }

    @Override
    public Number getNumber() {
        return number;
    }
}
