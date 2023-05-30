import java.util.Scanner;
class MainBigOf3Nos{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
    System.out.println("enter the 3 Integers.");
	int x=sc.nextInt();
	int y=sc.nextInt();
	int z=sc.nextInt();
	int big=x;
	if(y>big)
	    big=y;
	if(z>big)
	    big=z;
	System.out.println("Biggest of 2 Integers is: "+big);}
}