import java.util.Scanner;
class MainVoteAge{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the age to check the Right to Vote.");
	int i=sc.nextInt();
	if(i>=18)
	    System.out.println(i+" year old citizen is eligible to cast the vote.");
	else
	    System.out.println(i+" year old individual doesn't have Right to cast the vote.");}
}