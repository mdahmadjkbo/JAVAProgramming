import java.util.Scanner;
class MainBigOf2NosCondOp{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter both the 2 Integers.");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int i=(a>b)?a: b;
	    System.out.println(i+" is greatest.");}
}
	    