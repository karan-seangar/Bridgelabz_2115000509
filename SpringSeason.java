import java.util.Scanner;
class SpringSeason{
    public static void main(String[] args){
	Scanner sc =  new Scanner(System.in);
	int month = Integer.parseInt(args[0]);
	int day = Integer.parseInt(args[1]);
	if(month< 1 || month>12 ){
	    System.out.println("Invalid month! Please enter a value between 1 and 12");
	    System.exit(1);
        }
	if (day < 1 || day > 31) {
                System.out.println("Invalid day! Please enter a value between 1 and 31.");
                System.exit(1);
        }
	System.out.println(springSeason(month, day));
    }

    public static  boolean springSeason(int month, int day){
	if(month==3 && day >=20) return true;
	else if(month>3 && month<6) return true;
	else if(month==6 && day<=20) return true;
	else return false;
    }
}
