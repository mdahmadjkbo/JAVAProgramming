import java.util.Scanner;
class MainArithmetic{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 2 nos.");
	double x=sc.nextDouble();
	double y=sc.nextDouble();
	double add=x+y;
	double sub=x-y;
	double mul=x*y;
	double div=x/y;
	double rem=x%y;
	System.out.println("Addition of "+x+" & "+y+ " ="+add);
	System.out.println("Subtraction of "+x+" & "+y+" ="+sub);
	System.out.println("Multiplication of "+x+" & "+y+ " ="+mul);
	System.out.println("Division of "+x+" & "+y+" ="+div);
	System.out.println("Remainder of "+x+" & "+y+" ="+rem);}
}