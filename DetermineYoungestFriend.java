import java.util.Scanner;

public class DetermineYoungestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int amarAge = input.nextInt();
        int akbarAge = input.nextInt();
        int anthonyAge = input.nextInt();

        int amarHeight = input.nextInt();
        int akbarHeight = input.nextInt();
        int anthonyHeight = input.nextInt();

    
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("The youngest friend is: Amar");
        } 
        else if (akbarAge < amarAge && akbarAge < anthonyAge) {
           System.out.println("The youngest friend is: Akbar");
        } 
        else {
            System.out.println("The youngest friend is: Anthony");
        }

        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("The tallest friend is: Amar");
        } 
        else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("The tallest friend is: Akbar");
        } 
        else {
            System.out.println("The tallest friend is: Anthony");
        }
    }
}