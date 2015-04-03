import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Car> cars;

    public ParkingLot() {
        this.cars = new ArrayList<Car>();
    }

    public void store(Car car) {
        cars.add(car);
    }

    public Car pick(String carNumber) {
        for(Car car:cars) {
            if(car.isSame(carNumber))
                return car;
        }
        return null;
    }

    public void store(Car... cars) {
        for(Car car:cars) {
            store(car);
        }
    }
}
