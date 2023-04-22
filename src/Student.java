package src;

public class Student {
    String name;
    int rollNumber;
    String phoneNumber;
    String address;

    public Student(String name, int rollNumber, String phoneNumber, String address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Student sam = new Student("Sam", 101, "1234567890", "123 Main St");
        Student john = new Student("John", 102, "9876543210", "456 Oak Ave");

        sam.printDetails();
        System.out.println();
        john.printDetails();
    }
}
