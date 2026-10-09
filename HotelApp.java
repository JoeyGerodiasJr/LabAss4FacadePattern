public class HotelApp {
    public static void main(String[] args) {
        Valet valet = new Valet();
        HouseKeeping houseKeeping = new HouseKeeping();
        Cart cart = new Cart();

        FrontDesk frontDesk = new FrontDesk(valet, houseKeeping, cart);

        System.out.println("___Guest check-in___");
        frontDesk.pickUpVehicle("ABC-1234");
        frontDesk.cleanRoom("305");
        frontDesk.requestCart(2);

        System.out.println("--- Guest check-out ---");
        frontDesk.pickUpVehicle("ABC-1234");
    }
}