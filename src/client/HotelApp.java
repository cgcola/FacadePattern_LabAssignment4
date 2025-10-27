package client;

import facade.FrontDesk;

public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        System.out.println("=== Hotel Management System ===");

        frontDesk.requestValetService("NEU 5000");
        frontDesk.requestHousekeepingService(101);
        frontDesk.requestCartService(4);
    }
}
