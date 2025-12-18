package s14.exercicies;

import s14.entities.Reservation;
import s14.exceptions.DomainException;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ReservaHotel {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Room: ");
            int room = Integer.parseInt(sc.nextLine());
            System.out.print("Check-in date (dd/MM/yyyy): ");
            String chekin = sc.nextLine();
            System.out.print("Check-out date (dd/MM/yyyy):  ");
            String chekout = sc.nextLine();
            Reservation reservation = new Reservation(room, chekin, chekout);
            System.out.println(reservation);

            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            String chekinUpdate = sc.nextLine();
            System.out.print("Check-out date (dd/MM/yyyy):  ");
            String chekoutUpdate = sc.nextLine();
            reservation.updateDates(chekinUpdate, chekoutUpdate);
            System.out.println(reservation);
        }
        catch (DateTimeException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        catch (DomainException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}
