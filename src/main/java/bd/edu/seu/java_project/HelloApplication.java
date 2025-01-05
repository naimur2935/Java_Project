package bd.edu.seu.java_project;

import java.util.Scanner;

class User {
    String name;
    String contactNumber;
    String email;
    String address;

    User(String name, String contactNumber, String email, String address) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        this.address = address;
    }

    void displayUserInfo() {
        System.out.println("Name: " + name);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
    }
}

class Book {
    String title;
    String author;
    String subject;
    String uniqueId;

    Book(String title, String author, String subject, String uniqueId) {
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.uniqueId = uniqueId;
    }

    void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
        System.out.println("Unique ID: " + uniqueId);
    }
}

public class HelloApplication {
    static User[] users = new User[5];
    static Book[] books = new Book[5];
    static int userCount = 0;
    static int bookCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Register User");
            System.out.println("2. Add Book");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    registerUser(scanner);
                    break;
                case 2:
                    addBook(scanner);
                    break;
                case 3:
                    searchBook(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    static void registerUser(Scanner scanner) {
        if (userCount >= 5) {
            System.out.println("Maximum users registered.");
            return;
        }

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact number: ");
        String contactNumber = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        users[userCount++] = new User(name, contactNumber, email, address);
        System.out.println("User registered successfully.");
    }

    static void addBook(Scanner scanner) {
        if (bookCount >= 5) {
            System.out.println("Maximum books added.");
            return;
        }

        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter subject: ");
        String subject = scanner.nextLine();
        System.out.print("Enter unique ID: ");
        String uniqueId = scanner.nextLine();

        for (int i = 0; i < bookCount; i++) {
            if (books[i].uniqueId.equals(uniqueId)) {
                System.out.println("Book with this ID already exists.");
                return;
            }
        }

        books[bookCount++] = new Book(title, author, subject, uniqueId);
        System.out.println("Book added successfully.");
    }

    static void searchBook(Scanner scanner) {
        System.out.print("Enter title/author/subject/unique ID to search: ");
        String query = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].title.equalsIgnoreCase(query) ||
                    books[i].author.equalsIgnoreCase(query) ||
                    books[i].subject.equalsIgnoreCase(query) ||
                    books[i].uniqueId.equals(query)) {
                books[i].displayBookInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No book found with the given details.");
        }
    }
}
