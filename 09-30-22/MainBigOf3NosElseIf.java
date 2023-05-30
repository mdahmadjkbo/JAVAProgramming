import java.util.Scanner;
class MainBigOf3NosElseIf{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the 3 Integers.");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();

	    if(a>b && a>c)
		System.out.println(a+" is the biggest no.");

	    else if(b>c)
		System.out.println(b+" is the greatest no.");

	    else
		System.out.println(c+" is the biggest no.");}
}