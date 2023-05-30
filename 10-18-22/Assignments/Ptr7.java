import java.util.Scanner;

class Ptr7{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number:");
	int n=sc.nextInt();
	for(int i=n; i>=1; i--){
	    for(int j=n; j>=1; j--)
	    System.out.print(i+" ");
	System.out.println();}
    }
}