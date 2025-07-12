public class Student {
    String name = "John Doe";
    int rollNumber = 12345;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.displayDetails();
    }
}
