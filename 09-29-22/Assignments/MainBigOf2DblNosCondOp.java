import java.util.Scanner;
class MainBigOf2DblNosCondOp{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter both the 2 nos.");
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	double d=(a<b)?a: b;
	    System.out.println(d+" is smallest.");}
}
	    