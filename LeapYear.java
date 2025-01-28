import java.util.Scanner;
class LeapYear{

    public static boolean leapYear(int year){
	if((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)){
	    return true;
	}
	else{
	    return false;
	}
    }

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Year from 1582");
	int year = sc.nextInt();
	if(year<1582){
	    System.out.println("Invalid input!");
	}
	System.out.println(leapYear(year));
	
    }
}
