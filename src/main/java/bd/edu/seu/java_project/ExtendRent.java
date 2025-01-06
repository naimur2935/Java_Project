package bd.edu.seu.java_project;

import java.util.ArrayList;
import java.util.Scanner;

public class ExtendRent {
    public static void extend(ArrayList<Book> books, Scanner scanner) {
        System.out.print("Enter the unique ID of the book to extend rent: ");
        String uniqueId = scanner.nextLine();

        for (Book book : books) {
            if (book.uniqueId.equals(uniqueId)) {
                if (!book.isAvailable) {
                    System.out.print("Enter your email: ");
                    String email = scanner.nextLine();

                    if (!email.equals(book.rentedByEmail)) {
                        System.out.println("This book is not rented by you.");
                        return;
                    }

                    System.out.print("Enter additional rent duration (days): ");
                    int extraDays = scanner.nextInt();
                    scanner.nextLine();

                    book.rentDays += extraDays;
                    System.out.println("Rent extended by " + extraDays + " days. Total rent days: " + book.rentDays);
                } else {
                    System.out.println("Book is currently available and not rented.");
                }
                return;
            }
        }

        System.out.println("Book with the given ID not found.");
    }
}