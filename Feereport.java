import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private double feePaid;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.feePaid = 0;
    }

    public void makePayment(double amount) {
        if (amount > 0) {
            feePaid += amount;
            System.out.println("Payment of RS:" + amount + " received from " + name);
        } else {
            System.out.println("Invalid payment amount.");
        }
    }

    public double getRemainingFee(double totalFee) {
        return totalFee - feePaid;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}

class FeeReportApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        students.add(new Student("Uday", 2113));
        students.add(new Student("Ram", 2114));
        students.add(new Student("Ananya", 2115));
        students.add(new Student("Nived", 2116));
        students.add(new Student("Shivani", 2117));

        System.out.print("Enter total fee: ");
        double totalFee = scanner.nextDouble();

        for (Student student : students) {
            System.out.println("StudentName: " + student.getName() + " \n(Roll Number: " + student.getRollNumber() + ")");
            System.out.print("Enter payment amount for " + student.getName() + ": ");
            double payment = scanner.nextDouble();
            student.makePayment(payment);
            System.out.println("Remaining fee for " + student.getName() + ": RS:" + student.getRemainingFee(totalFee));
            System.out.println();
        }

    }
}
