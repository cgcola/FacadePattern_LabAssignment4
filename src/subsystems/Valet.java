package subsystems;

public class Valet implements HotelService {
    @Override
    public void performService() {
        System.out.println("Valet service is ready for vehicle handling.");
    }

    public void pickUpVehicle(String plateNumber){
        System.out.println("Picking up vehicle with plate number: " + plateNumber);
    }
}
