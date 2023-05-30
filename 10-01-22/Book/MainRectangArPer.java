import java.util.Scanner;
class MainRectangArPer{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Length Breadth of the Rectangle.");
	int l=sc.nextInt();
	int b=sc.nextInt();
	int ar=l*b;
	int per=2*(l+b);
	    System.out.println();
	    System.out.println("Outputs: Area: "+ar);
	    System.out.println();
	    System.out.println("       Perimeter: "+per);}
}
 