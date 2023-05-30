import java.util.Scanner;

class Inte{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number to print from 1 to n:");
	int n=sc.nextInt();
	for(; n>=1; n--)
	    System.out.print(n+" ");
	System.out.println("Thanks");}
}