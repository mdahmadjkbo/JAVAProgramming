import java.util.Scanner;
class MainPosNegNo{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the Integer.");
	int i=sc.nextInt();
	if(i>0)
	    System.out.println(i+" is a positive Integer.");
	else if(i==0)
	    System.out.println(i+" is Zero.");
	else
	    System.out.println(i+" is a Negaitive Integer.");}
}
	    