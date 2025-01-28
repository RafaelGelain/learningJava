package application;

import entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {

            System.out.print("Room Number : ");
            int number = sc.nextInt();
            System.out.print("Check-In date (dd/MM/yyyy) : ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-Out date (dd/MM/yyyy) : ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number,checkIn,checkOut);
            System.out.println("RESERVATION : " + reservation);

            System.out.println();
            System.out.print("ENTEDER DATA TO UPDATE THE RESERVATION : ");
            System.out.print("Check-In date (dd/MM/yyyy) : ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-Out date (dd/MM/yyyy) : ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("RESERVATION : " + reservation);
        }
        catch (ParseException e){
            System.out.println("Invalid date format");
        }
        catch (DomainException e){
            System.out.println("Error in reservation " + e.getMessage());
        }






        sc.close();
    }
}