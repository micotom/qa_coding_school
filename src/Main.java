import interfaces.FamilyCar;
import interfaces.Motorbike;
import interfaces.PrivateUseVehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<PrivateUseVehicle> privateVehicles = new ArrayList<>();
        privateVehicles.add(
                new FamilyCar(4, "Blue", "Alex")
        );
        privateVehicles.add(
                new Motorbike(2, "Black", "Irene")
        );
        for (PrivateUseVehicle v : privateVehicles) {
            System.out.println(v.getOwner());
        }

    }

}
