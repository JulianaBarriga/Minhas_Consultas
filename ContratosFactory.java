package Factory;

public class ContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if("A".equalsIgnoreCase(requestedGrade)){
            return new CorollaCar(150, "Cheio", "Cinza");
        } else if("B".equalsIgnoreCase(requestedGrade)){
            return new FastbackCar(200, "Cheio", "Prata");
        } else{
            return null;
        }
    }
}
