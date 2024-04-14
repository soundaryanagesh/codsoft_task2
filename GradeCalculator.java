import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks obtained in each subject (out of 100):");

        int totalMarks = 0;
        double averagePercentage = 0.0;

        // Input marks for each subject
        System.out.print("Mathematics: ");
        int mathMarks = scanner.nextInt();
        totalMarks += mathMarks;

        System.out.print("English: ");
        int englishMarks = scanner.nextInt();
        totalMarks += englishMarks;

        System.out.print("Science: ");
        int scienceMarks = scanner.nextInt();
        totalMarks += scienceMarks;

        System.out.print("Social Studies: ");
        int socialMarks = scanner.nextInt();
        totalMarks += socialMarks;

        System.out.print("Hindi: ");
        int hindiMarks = scanner.nextInt();
        totalMarks += hindiMarks;

        // Calculate average percentage
        averagePercentage = (double) totalMarks / 5;

        // Assign grades
        String grade = calculateGrade(averagePercentage);

        // Display results
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    private static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A+";
        } else if (averagePercentage >= 80) {
            return "A";
        } else if (averagePercentage >= 70) {
            return "B";
        } else if (averagePercentage >= 60) {
            return "C";
        } else if (averagePercentage >= 50) {
            return "D";
        } else {
            return "Fail";
        }
    }
}
