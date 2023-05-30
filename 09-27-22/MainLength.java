import java.util.Scanner;
class MainLength{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length of the stick in Inches.");
	double l=sc.nextDouble();
	double lf=0.083333*l;
	double lm=0.0254*l;
	System.out.println();
	System.out.println("Length of the Stick in Feet ="+lf);
	System.out.println("Length of the Stick in Meter ="+lm);}
}