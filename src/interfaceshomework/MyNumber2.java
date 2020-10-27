package interfaceshomework;

public class MyNumber2 implements ComparableNumber {

    public final float number;

    public MyNumber2(float number) {
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
