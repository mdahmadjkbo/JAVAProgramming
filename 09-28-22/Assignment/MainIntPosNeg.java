import java.util.Scanner;
class MainIntPosNeg{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the integer.");
	int i=sc.nextInt();
	if(i>0)
	    System.out.println("the entered no. is Positive.");
	if(i==0)
	    System.out.println("the entered no. is Zero.");
	if(i<0)
	    System.out.println("the entered no. is Negative.");}
}