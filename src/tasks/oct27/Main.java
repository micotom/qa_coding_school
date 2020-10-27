package tasks.oct27;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Circle> circleList = new HashSet<>();

        boolean keepCreatingCircles = true;
        while (keepCreatingCircles) {
            double randomRadius = Math.random();
            keepCreatingCircles = randomRadius >= 0.01;
            Circle circle = new Circle(randomRadius);
            circleList.add(circle);
        }

        for (Circle circle : circleList) {
            System.out.println(circle);
        }

    }

}
