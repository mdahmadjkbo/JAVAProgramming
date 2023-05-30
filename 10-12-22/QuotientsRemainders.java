import java.util.Scanner;

class QuotientsRemainders{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the dividend:");
	int n=sc.nextInt();
	    System.out.println("enter the divisor:");
	int d=sc.nextInt();

	System.out.println("Quotient: "+n/d);
	System.out.println("Remainder: "+n%d);}
	//double decd=n/d;
	//double decm=n%d;
	//System.out.println(decd);
	//System.out.println(decm);}
}