import java.util.Scanner;

class Md{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number to print how many time you wanna print your name:");
	int n=sc.nextInt();
	    System.out.println("enter your name:");
	String name=sc.next();
	for(int i=1; i<=n; i++)
	    System.out.println(name);
	System.out.println("Thanks");}
}