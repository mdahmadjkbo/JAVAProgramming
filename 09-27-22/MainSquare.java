import java.util.Scanner;
class MainSquare{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the side of the square.");
	double a=sc.nextDouble();
	double ar=a*a;
	double pr=2*(a+a);
	System.out.println("Area of the Square ="+ar);
	System.out.println("Parameter of the Square ="+pr);}
}