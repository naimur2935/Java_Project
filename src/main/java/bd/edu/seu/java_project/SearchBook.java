package bd.edu.seu.java_project;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchBook {
    public static void search(ArrayList<Book> books, Scanner scanner) {
        System.out.print("Enter title/author/subject/unique ID to search: ");
        String query = scanner.nextLine();

        boolean found = false;
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(query) ||
                    book.author.equalsIgnoreCase(query) ||
                    book.subject.equalsIgnoreCase(query) ||
                    book.uniqueId.equals(query)) {
                book.displayBookInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No book found with the given details.");
        }
    }
}