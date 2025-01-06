package bd.edu.seu.java_project;

import java.util.ArrayList;
import java.util.Scanner;

public class RegisterUser {
    public static void register(ArrayList<User> users, Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact number: ");
        String contactNumber = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        users.add(new User(name, contactNumber, email, address));
        System.out.println("User registered successfully.");
    }
}
