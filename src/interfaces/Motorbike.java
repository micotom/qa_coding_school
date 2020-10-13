package interfaces;

public class Motorbike extends Vehicle implements PrivateUseVehicle {

    private String owner;

    public Motorbike(int nrOfTires, String color, String owner) {
        super(nrOfTires, color);
        this.owner = owner;
    }

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    int getNumberOfTires() {
        return nrOfTires;
    }

    @Override
    String getColor() {
        return color;
    }

}
