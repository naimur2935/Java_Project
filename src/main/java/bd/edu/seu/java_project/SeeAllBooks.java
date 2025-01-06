package bd.edu.seu.java_project;

import java.util.ArrayList;

public class SeeAllBooks {
    public static void display(ArrayList<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\nList of Books:");
        for (Book book : books) {
            book.displayBookInfo();
            System.out.println("------------------------");
        }
    }
}