import java.util.Scanner;

class InteiTof{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter initial number i:");
	int i=sc.nextInt();
	    System.out.println("enter final number f:");
	int f=sc.nextInt();
	for(; i<=f; i++)
	    System.out.print(i+" ");
	System.out.println("Thanks");}
}