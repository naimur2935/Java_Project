package bd.edu.seu.java_project;

import java.util.ArrayList;
import java.util.Scanner;

public class AddBook {
    public static void add(ArrayList<Book> books, Scanner scanner) {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter subject: ");
        String subject = scanner.nextLine();
        System.out.print("Enter unique ID: ");
        String uniqueId = scanner.nextLine();

        for (Book book : books) {
            if (book.uniqueId.equals(uniqueId)) {
                System.out.println("Book with this ID already exists.");
                return;
            }
        }

        books.add(new Book(title, author, subject, uniqueId, true));
        System.out.println("Book added successfully.");
    }
}