package bd.edu.seu.java_project;

public class User {
    public String name;
    public String contactNumber;
    public String email;
    public String address;

    public User(String name, String contactNumber, String email, String address) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        this.address = address;
    }

    public void displayUserInfo() {
        System.out.println("Name: " + name);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
    }
}