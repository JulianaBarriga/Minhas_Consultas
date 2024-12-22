package Factory;

import org.w3c.dom.ls.LSOutput;

public class SemContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if("A".equalsIgnoreCase(requestedGrade)){
            return new KicksCar(50, "Cheio", "Branco");
        } else {
            return null;
        }
    }
}
