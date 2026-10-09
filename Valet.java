public class Valet implements HotelService {
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet: picking up vehicle with plate number " + plateNumber);
    }
}