package interfaces;

public class FamilyCar extends Vehicle implements PrivateUseVehicle {

    private String owner;

    public FamilyCar(int nrOfTires, String color, String owner) {
        super(nrOfTires, color);
        this.owner = owner;
    }

    @Override
    int getNumberOfTires() {
        return nrOfTires;
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    public String getOwner() {
        return owner;
    }

}
