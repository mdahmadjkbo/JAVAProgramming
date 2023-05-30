import java.util.Scanner;
class MainBigOf3NosCondOp{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the 3 Integers.");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int big=(a>b)?((a>c)?a:c):((b>c)?b:c);
	    System.out.println(big+" is biggest.");
    }
}