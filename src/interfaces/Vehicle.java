package interfaces;

public abstract class Vehicle {

    protected final int nrOfTires;
    protected final String color;

    public Vehicle(int nrOfTires, String color) {
        this.nrOfTires = nrOfTires;
        this.color = color;
    }

    abstract int getNumberOfTires();

    abstract String getColor();

}
