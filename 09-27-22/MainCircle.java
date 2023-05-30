import java.util.Scanner;
class MainCircle{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the radius.");
	double r=sc.nextDouble();
	double ar=3.1428*r*r;
	double cir=2*3.1428*r;
	System.out.println("Area of the Circle is: "+ar);
	System.out.println("Circumference of the Circle is: "+cir);}
}