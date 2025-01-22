import java.util.Scanner;
class TotalNumberOfHandshake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is " + maxHandshakes);
    }
}