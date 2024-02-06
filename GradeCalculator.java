import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Student 1
        System.out.println("Enter marks for Student 1 (Subject 1, Subject 2, Subject 3):");
        double[] student1Marks = readMarks(scanner);

        // Input for Student 2
        System.out.println("Enter marks for Student 2 (Subject 1, Subject 2, Subject 3):");
        double[] student2Marks = readMarks(scanner);

        // Input for Student 3
        System.out.println("Enter marks for Student 3 (Subject 1, Subject 2, Subject 3):");
        double[] student3Marks = readMarks(scanner);

        // Calculate percentages
        double student1Percentage = calculatePercentage(student1Marks);
        double student2Percentage = calculatePercentage(student2Marks);
        double student3Percentage = calculatePercentage(student3Marks);

        // Display results
        displayResults("Student 1", student1Percentage);
        displayResults("Student 2", student2Percentage);
        displayResults("Student 3", student3Percentage);

        scanner.close();
    }

    private static double[] readMarks(Scanner scanner) {
        double[] marks = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }
        return marks;
    }

    private static double calculatePercentage(double[] marks) {
        double totalMarks = 0;
        for (double mark : marks) {
            totalMarks += mark;
        }
        return (totalMarks / (3 * 100)) * 100; // Assuming each subject has a maximum of 100 marks
    }

    private static void displayResults(String studentName, double percentage) {
        System.out.println(studentName + " - Percentage: " + percentage + "% - Grade: " + determineGrade(percentage));
    }

    private static char determineGrade(double percentage) {
        if (percentage > 80) {
            return 'A';
        } else if (percentage > 70) {
            return 'B';
        } else if (percentage > 60) {
            return 'C';
        } else {
            return 'F';
        }
    }
}
