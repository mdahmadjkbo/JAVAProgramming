import java.util.Scanner;
class MainEvenOddDivision{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no.");
	int i=sc.nextInt();
	if(i/2*2==i)
	    System.out.println(i+" is an Even no.");
	else
	    System.out.println(i+" is an Odd no.");}
}