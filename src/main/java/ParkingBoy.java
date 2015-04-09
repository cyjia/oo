public class ParkingBoy {
    private ParkingLot[] parkingLots;

    public ParkingBoy(ParkingLot... parkingLots) {
        this.parkingLots = parkingLots;
    }

    public void store(Car car) {
        parkingLots[0].store(car);
    }

    public Car pick(String carNumber) {
        return parkingLots[0].pick(carNumber);
    }
}
