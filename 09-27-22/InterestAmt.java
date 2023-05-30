import java.util.Scanner;
class InterestAmt{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter principal amount.");
	double pa=sc.nextDouble();
	System.out.println("enter interest rate.");
	double ir=sc.nextDouble();
	System.out.println("enter amount of time.");
	double t=sc.nextDouble();
	
	double ai=pa*ir*t;
	System.out.println("total amount of interest ="+ai);}
}