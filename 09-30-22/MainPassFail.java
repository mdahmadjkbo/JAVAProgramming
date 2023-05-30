import java.util.Scanner;
class MainPassFailLogicalOr{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Marks within 0 & 100 of all the 4 Subjects PCMB.");
	int p=sc.nextInt();
	int c=sc.nextInt();
	int m=sc.nextInt();
	int b=sc.nextInt();

	if(p<35 || c<35 || m<35 || b<35)
	    System.out.println("The candidate is Failed.");

	else
	    System.out.println("The candidate is passed.");}
}