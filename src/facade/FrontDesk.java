package facade;

import subsystems.Cart;
import subsystems.Housekeeping;
import subsystems.Valet;

public class FrontDesk {
    private Valet valet;
    private Housekeeping housekeeping;
    private Cart cart;

    public FrontDesk() {
        valet = new Valet();
        housekeeping = new Housekeeping();
        cart = new Cart();
    }

    public void requestValetService(String plateNumber) {
        System.out.println("\nDispatching request to Valet Service...");
        valet.performService();
        valet.pickUpVehicle(plateNumber);
    }

    public void requestHousekeepingService(int roomNumber) {
        System.out.println("\nDispatching request to Housekeeping Service...");
        housekeeping.performService();
        housekeeping.cleanRoom(roomNumber);
    }

    public void requestCartService(int numberOfCarts) {
        System.out.println("\nDispatching request to Cart Service...");
        cart.performService();
        cart.requestCart(numberOfCarts);
    }
}
