package Polymorphism40;

import java.util.Random;

public class PolymorphismCasino {

    public static void main(String[] args) {
        Shape shape = getRandomShapes();
        shape.display();

    }

    public static Shape getRandomShapes() {
        // Random is an existing class in Java
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0:
                DashedLine dashedLine = new DashedLine();
                return dashedLine;
            case 1:
                return new HashLine();
            default:
                return new StarLine();
        }
    }
}

