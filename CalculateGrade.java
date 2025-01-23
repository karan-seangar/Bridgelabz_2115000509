import java.util.Scanner;

public class CalculateGrade{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int physicMarks = input.nextInt();
        int mathMarks = input.nextInt();
        int chemistryMarks = input.nextInt();
        int averageMarks = (physicMarks + mathMarks + chemistryMarks) / 3;

        if(averageMarks >= 80){
            System.out.println("Student having Average marks greater than or equal to 80 will get A grade.");
            System.out.println("Remark: Level 4, above agency-normalises standard");
        }
        else if(averageMarks >= 70 && averageMarks < 80){
            System.out.println("Student having Average marks greater than or equal to 70 and less than 80 will get B grade.");
            System.out.println("Remark: Level 3, at agency-normalises standard");
        }
         else if(averageMarks >= 60 && averageMarks < 70){
            System.out.println("Student having Average marks greater than or equal to 60 and less than 70 will get C grade.");
            System.out.println("Remark: Level 2 below, but approaching agency-normalises standard");
        }
         else if(averageMarks >= 50 && averageMarks < 60){
            System.out.println("Student having Average marks greater than or equal to 50 and less than 60 will get D grade.");
            System.out.println("Remark: Level 1, well below agency-normalises standard");
        }
         else if(averageMarks >= 40 && averageMarks < 50){
            System.out.println("Student having Average marks greater than or equal to 40 and less than 50 will get E grade.");
            System.out.println("Remark: Level 1, too below agency-normalises standard");
        }
        else{
            System.out.println("Student having Average marks less than 40 will get R grade.");
            System.out.println("Remark: Remedial standard");

        }
    }
}