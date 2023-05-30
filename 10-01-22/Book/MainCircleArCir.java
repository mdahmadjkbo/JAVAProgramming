import java.util.Scanner;
class MainCircleArCir{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Radius of the Circle.");
	double r=sc.nextDouble();
	double ar=3.14159*r*r;
	double cir=2*3.14159*r;
	    System.out.println();
	    System.out.println("Outputs: Area: "+ar);
	    System.out.println("       Circumference: "+cir);}
}
 