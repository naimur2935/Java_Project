package bd.edu.seu.java_project;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    // Default admin credentials
    static final String ADMIN_USERNAME = "admin";
    static final String ADMIN_PASSWORD = "password";

    public static void main(String[] args) {
        // Display login credentials
        System.out.println("Default Login Credentials:");
        System.out.println("Username: " + ADMIN_USERNAME);
        System.out.println("Password: " + ADMIN_PASSWORD);
        System.out.println();

        // Login system
        if (!login()) {
            System.out.println("Invalid credentials. Exiting...");
            return;
        }

        // Initialize default data
        initializeData();

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Register User");
            System.out.println("2. Add Book");
            System.out.println("3. Search Book");
            System.out.println("4. See All Books");
            System.out.println("5. Rent a Book");
            System.out.println("6. Extend Rent Period");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1 -> RegisterUser.register(users, scanner);
                case 2 -> AddBook.add(books, scanner);
                case 3 -> SearchBook.search(books, scanner);
                case 4 -> SeeAllBooks.display(books);
                case 5 -> RentBook.rent(books, users, scanner);
                case 6 -> ExtendRent.extend(books, scanner);
                case 7 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void initializeData() {
        // Add default users and books
        users.add(new User("Md. Rahim", "01711111111", "rahim@example.com", "Dhaka"));
        users.add(new User("Ayesha Akter", "01722222222", "ayesha@example.com", "Chittagong"));
        users.add(new User("Karim Hossain", "01733333333", "karim@example.com", "Sylhet"));
        users.add(new User("Fatema Begum", "01744444444", "fatema@example.com", "Rajshahi"));
        users.add(new User("Abdul Jabbar", "01755555555", "jabbar@example.com", "Khulna"));

        books.add(new Book("Java Programming", "John Doe", "Programming", "B001", true));
        books.add(new Book("Data Structures", "Jane Smith", "Computer Science", "B002", true));
        books.add(new Book("Operating Systems", "Jim Bean", "Technology", "B003", true));
    }

    private static boolean login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        return username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD);
    }
}
