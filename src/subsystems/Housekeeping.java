package subsystems;

public class Housekeeping implements HotelService {

    @Override
    public void performService() {
        System.out.println("Housekeeping service is ready for room cleaning.");
    }

    public void cleanRoom(int roomNumber) {
        System.out.println("Cleaning up room: " + roomNumber);
    }
}
