import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class ParkingLotTest {

    @Test
    public void should_pick_the_car_given_a_car_was_stored_in_the_parking_lot() throws Exception {
        ParkingLot parkingLot = new ParkingLot();
        String carNumber = "601 ACK";
        Car car = new Car(carNumber);

        parkingLot.store(car);

        assertSame(car, parkingLot.pick(carNumber));
    }

    @Test
    public void should_pick_the_cars_given_two_cars_were_stored_in_the_parking_lot() throws Exception {
        ParkingLot parkingLot = new ParkingLot();
        String firstNumber = "firstNumber";
        Car firstCar = new Car(firstNumber);
        String secondNumber = "secondNumber";
        Car secondCar = new Car(secondNumber);

        parkingLot.store(firstCar, secondCar);

        assertSame(firstCar, parkingLot.pick(firstNumber));
        assertSame(secondCar, parkingLot.pick(secondNumber));
    }
}
