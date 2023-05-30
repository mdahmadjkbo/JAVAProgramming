import java.util.Scanner;

class Int{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number to print from 1 to n:");
	int n=sc.nextInt();
	for(int i=1; i<=n; i++)
	    System.out.print(i+" ");
	System.out.println("Thanks");}
}