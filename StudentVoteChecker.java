import java.util.Scanner;
class StudentVoteChecker{

    public boolean canStudentVote(int age){
	if(age<0){
	    return false;
	}
	if(age>=18){
	    return true;
	}
	return false;
    }

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] studentsAge = new int[10];
	for(int i=0;i<10;i++){
	    System.out.println("Enter student " + (i+1) + "'s age");
	    studentsAge[i] = sc.nextInt();
	}
	 StudentVoteChecker obj = new StudentVoteChecker(); 
	for(int i=0;i<10;i++){
	    System.out.println(obj.canStudentVote(studentsAge[i]));
	}
    }
}
