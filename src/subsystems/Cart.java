package subsystems;

public class Cart implements HotelService {

    @Override
    public void performService(){
        System.out.println("Cart service is ready for luggage handling.");
    }

    public void requestCart(int numberOfCarts){
        System.out.println(numberOfCarts + " luggage cart(s) are on their way!");
    }
}
