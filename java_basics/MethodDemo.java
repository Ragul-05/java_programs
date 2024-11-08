package java_basics;

import java.util.Scanner;

class TurfBooking {
    private final String[] slots = {
        "6 AM - 8 AM",
        "8 AM - 10 AM",
        "4 PM - 6 PM",
        "6 PM - 8 PM",
        "8 PM - 10 PM"
    };
    private final int[] slotPrices = {500, 600, 700, 800, 900};

    public void listOfSlots() {
        for (int i = 0; i < slots.length; i++) {
            System.out.println((i + 1) + ". " + slots[i] + " - Minimum price: " + slotPrices[i]);
        }
    }

    public String bookSlot(int choice, int payment) {
        switch (choice) {
            case 1 -> {
                if (payment >= slotPrices[0]) 
                    return "Booked slot: " + slots[0] + "\nPrice of booking: " + payment;
            }
            case 2 -> {
                if (payment >= slotPrices[1]) 
                    return "Booked slot: " + slots[1] + "\nPrice of booking: " + payment;
            }
            case 3 -> {
                if (payment >= slotPrices[2]) 
                    return "Booked slot: " + slots[2] + "\nPrice of booking: " + payment;
            }
            case 4 -> {
                if (payment >= slotPrices[3]) 
                    return "Booked slot: " + slots[3] + "\nPrice of booking: " + payment;
            }
            case 5 -> {
                if (payment >= slotPrices[4]) 
                    return "Booked slot: " + slots[4] + "\nPrice of booking: " + payment;
            }
        }
        return "Booking unsuccessful. Please check the amount.";
    }
}

public class MethodDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Turf Booking System----");

        TurfBooking booking = new TurfBooking();
        booking.listOfSlots();   // Display available slots

        System.out.println("\nEnter your slot choice and payment amount:");
        int option = sc.nextInt();
        int payment = sc.nextInt();

        // Check booking with the provided choice and payment
        String bookingStatus = booking.bookSlot(option, payment);
        System.out.println("\n" + bookingStatus);
        
        sc.close();
    }
}
