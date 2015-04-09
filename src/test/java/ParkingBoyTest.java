import org.junit.Test;

import static org.junit.Assert.assertSame;

public class ParkingBoyTest {

    @Test
    public void should_pick_the_car_from_parking_lot_given_a_car_is_stored_in_a_parking_lot_by_parking_boy() throws Exception {
        ParkingLot parkingLot = new ParkingLot();
        String carNumber = "1234";
        Car car = new Car(carNumber);
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot, new ParkingLot());

        parkingBoy.store(car);

        assertSame(car, parkingLot.pick(carNumber));
    }

    @Test
    public void should_pick_the_car_given_a_car_is_stored_by_parking_boy() throws Exception {
        ParkingLot parkingLot = new ParkingLot();
        String carNumber = "1234";
        Car car = new Car(carNumber);
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot, new ParkingLot());

        parkingBoy.store(car);

        assertSame(car, parkingBoy.pick(carNumber));
    }

    @Test
    public void should_pick_the_car_given_a_parking_boy_with_two_parking_lots_and_a_car_is_stored() throws Exception {
        ParkingBoy parkingBoy = new ParkingBoy(new ParkingLot(), new ParkingLot());
        String carNumber = "1234";
        Car car = new Car(carNumber);

        parkingBoy.store(car);

        assertSame(car, parkingBoy.pick(carNumber));
    }
}
