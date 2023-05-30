import java.util.Scanner;

class MainPalindrome{

    static boolean isPalindrome(int n){
	     System.out.println("n: "+n);
	int r, rev=0, temp=n;
	     System.out.println("temp: "+temp);
	do{
	    r=n%10;
	     System.out.println("r: "+r);
	    rev=rev*10+r;
	     System.out.println("rev: "+rev);
	    n/=10;
	     System.out.println("n: "+n);
	}while(n!=0);
	     System.out.println("n: "+n);
    return rev==temp;}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number to check Palindrome:");
	int n=sc.nextInt();

	boolean pal=isPalindrome(n);
	String res=pal?"":"not ";
	    System.out.println(n+" : "+res+"a Palindrome Number.");}
}  