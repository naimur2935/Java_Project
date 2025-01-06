package bd.edu.seu.java_project;

import java.util.ArrayList;
import java.util.Scanner;

public class RentBook {
    public static void rent(ArrayList<Book> books, ArrayList<User> users, Scanner scanner) {
        System.out.print("Enter the unique ID of the book to rent: ");
        String uniqueId = scanner.nextLine();

        for (Book book : books) {
            if (book.uniqueId.equals(uniqueId)) {
                if (book.isAvailable) {
                    System.out.print("Enter your email: ");
                    String email = scanner.nextLine();

                    boolean userExists = users.stream().anyMatch(user -> user.email.equals(email));
                    if (!userExists) {
                        System.out.println("User with this email is not registered.");
                        return;
                    }

                    System.out.print("Enter rent duration (days): ");
                    int days = scanner.nextInt();
                    scanner.nextLine();

                    book.isAvailable = false;
                    book.rentDays = days;
                    book.rentedByEmail = email;
                    System.out.println("Book rented successfully for " + days + " days by " + email + ".");
                } else {
                    System.out.println("Book is already rented.");
                }
                return;
            }
        }

        System.out.println("Book with the given ID not found.");
    }
}