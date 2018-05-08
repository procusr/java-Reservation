import java.util.Scanner;
import java.util.*;
public class Main {
    //instance variables
    private Scanner input = new Scanner(System.in);
    Passenger[] passengers = new Passenger[5];
    Passenger passenger;

    public static void main(String[] args) {
        Main myApp = new Main();
        int n;
        //main menu options for booking
        do {
            System.out.println("1.Add booking ");
            System.out.println("2.view booking");
            System.out.println("3.exit          ");
            System.out.println("***************");
            n = myApp.input.nextInt();
            myApp.input.nextLine();

            switch (n) {
                case 1:
                    myApp.addBooking();
                    break;
                case 2:
                    myApp.viewBooking();
                    break;
                case 3:
                    System.out.println("thank you,Have a good flight!");
                    break;
                default:
                    System.out.println("please Enter the options again");

            }

        }
        while (n != 3);
    }

    public void addBooking() {
        System.out.println("Passengers Name: ");
        String customerName = input.nextLine();
        passenger = new Passenger(customerName);
        boolean b = true;
        int i = 0;
        //Checks if the seats are not already occupied
        while (true) {
            System.out.println("Enter Seat number,(0-100): ");
            Integer seatNumber = input.nextInt();
            input.nextLine();
            if (passengers[seatNumber]==null) {
                passengers[seatNumber] = passenger;
                break;
            }
        }
    }

    //view passengers
    public void viewBooking() {

        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] == null) {
                System.out.format("[%d] %s%n", i,"not booked");
            } else {
                System.out.format("[%d] %s%n", i, passengers[i]);
            }
        }

    }
}
