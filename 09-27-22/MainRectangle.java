import java.util.Scanner;
class MainRectangle{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length & breadth of the rectangle.");
	double l=sc.nextDouble();
	double b=sc.nextDouble();
	double ar=l*b;
	double pr=2*(l+b);
	System.out.println("Area of the Rectangle ="+ar);
	System.out.println("Parameter of the Rectangle ="+pr);}
}