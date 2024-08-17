import java.util.Scanner;

public class IT24103312Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int examMarks;
        int labMarks;
        int examMarksPerc;
        int labMarksPerc;
        int finalExamMark;
        int finalLabMark;
        int finalMarks;

        while (true) {
            System.out.print("Enter Exam Marks (0-100): ");
            examMarks = input.nextInt();
            if (examMarks >= 0 && examMarks <= 100) break;
            System.out.println("Invalid Exam Mark. Please try again.");
        }

        while (true) {
            System.out.print("Enter Lab Marks (0-100): ");
            labMarks = input.nextInt();
            if (labMarks >= 0 && labMarks <= 100) break;
            System.out.println("Invalid Lab Mark. Please try again.");
        }

        while (true) {
            System.out.print("Enter Percentage for Exam Marks (0-100): ");
            examMarksPerc = input.nextInt();
            System.out.print("Enter Percentage for Lab Marks (0-100): ");
            labMarksPerc = input.nextInt();
            if (examMarksPerc + labMarksPerc == 100) break;
            System.out.println("Invalid Percentages. Please try again.");
        }

        finalExamMark = examMarks * examMarksPerc / 100;
        finalLabMark = labMarks * labMarksPerc / 100;

        finalMarks = finalExamMark + finalLabMark;

        System.out.printf("Your Final Mark is %d%n", finalMarks);
    }
}