import java.util.Scanner;
class MainSmallOf2Nos{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
    System.out.println("enter the 2 Integers.");
	int x=sc.nextInt();
	int y=sc.nextInt();
	int bs=x;
	if(y<bs)
	    bs=y;
	System.out.println("Smallest of 2 Integers is: "+bs);}
}