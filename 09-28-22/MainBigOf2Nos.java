import java.util.Scanner;
class MainBigOf2Nos{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
    System.out.println("enter the 2 Integers.");
	int x=sc.nextInt();
	int y=sc.nextInt();
	int big=x;
	if(y>big)
	    big=y;
	System.out.println("Biggest of 2 Integers is: "+big);}
}