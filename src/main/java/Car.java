public class Car {
    private final String number;

    public Car(String carNumber) {
        number = carNumber;
    }

    public boolean isSame(String carNumber) {
        return number.equals(carNumber);
    }
}
