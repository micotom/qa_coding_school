package interfaces;

public interface PublicTransportVehicle {

    enum City {
        MUNICH, HAMBURG, BERLIN;
    }

    City getOwner();

}
