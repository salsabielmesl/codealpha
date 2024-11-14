package javaintern;
import java.util.*;
public class StudentGradesArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int max_grades = 100; 
        double[] grades = new double[max_grades];
        int count = 0;

        System.out.println("Enter student grades (type '-1' to finish):");

        while (count < max_grades) {
            String input = in.nextLine();

            
            if (input.equals("-1")) {
                break;
            }
            

            try {
                double grade = Double.parseDouble(input);
                grades[count] = grade;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid grade or '-1' to finish.");
            }
        }

        if (count == 0) {
            System.out.println("No grades were entered.");
        } else {
            double total = 0;
            double h = grades[0];
            double l = grades[0];

            for (int i = 0; i < count; i++) {
                total += grades[i];
                if (grades[i] > h) {
                    h = grades[i];
                }
                if (grades[i] < l) {
                    l = grades[i];
                }
            }

            double av = total / count;

            System.out.println("average score: " + av);
            System.out.println("highest score: "+ h);
            System.out.println("lowest score: " + l);
        }
    }
}