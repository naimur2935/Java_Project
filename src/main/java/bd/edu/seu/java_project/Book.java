package bd.edu.seu.java_project;

public class Book {
    public String title;
    public String author;
    public String subject;
    public String uniqueId;
    public boolean isAvailable;
    public int rentDays;
    public String rentedByEmail;

    public Book(String title, String author, String subject, String uniqueId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.uniqueId = uniqueId;
        this.isAvailable = isAvailable;
        this.rentDays = 0;
        this.rentedByEmail = null;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
        System.out.println("Unique ID: " + uniqueId);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Rented"));
        if (!isAvailable) {
            System.out.println("Rented By: " + rentedByEmail);
            System.out.println("Rent Days Remaining: " + rentDays);
        }
    }
}