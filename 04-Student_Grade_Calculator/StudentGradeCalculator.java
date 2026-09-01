import java.util.*;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===STUDENT GRADE CALCULATOR===");

        System.out.print("\nEnter number of subjects: ");
        int n = sc.nextInt();

        float marks[] = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter the marks of subject->" + (i + 1) + ": ");
            marks[i] = sc.nextFloat();
        }

        float total = 0;

        float highest = marks[0];
        float lowest = marks[0];

        for (int i = 0; i < n; i++) {

            total = total + marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        float perc = (total / (n * 100.0f)) * 100;

        String grade;

        if (perc >= 90) {
            grade = "A+";
        }
        else if (perc >= 80) {
            grade = "A";
        }
        else if (perc >= 70) {
            grade = "B";
        }
        else if (perc >= 60) {
            grade = "C";
        }
        else if (perc >= 50) {
            grade = "D";
        }
        else {
            grade = "F";
        }

        String status;

        if (perc >= 40) {
            status = "PASS";
        }
        else {
            status = "FAIL";
        }

        System.out.println("\n=====RESULTS=====");
        System.out.println("\nTotal=" + total);
        System.out.println("Percentage=" + perc + "%");
        System.out.println("Highest Marks=" + highest);
        System.out.println("Lowest Marks=" + lowest);
        System.out.println("Grade=" + grade);
        System.out.println("Status=" + status);

        sc.close();
    }
}
