import java.util.Scanner;
class MainSI14{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.print("Input: ");
	double a=sc.nextDouble();
	double i=sc.nextDouble();
	double t=sc.nextDouble();
	double si=a*(1+(i*t)/100);
	    System.out.println("Output: "+si);}
}