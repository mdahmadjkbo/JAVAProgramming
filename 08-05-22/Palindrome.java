import java.util.Scanner;
class Palindrome //no. remains same after reverse
{
    static boolean isPalindrome(int x)
    {
	int rev=0, temp=x;
	do{
	    int r=x%10;
	    rev=rev*10+r;
	    x=x/10;
	}while(x!=0);
    return rev==temp;
    }
    public static void main(String[]args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no.: ");
	int n=sc.nextInt();
	boolean rs=isPalindrome(n);
	if(rs==true)
	    System.out.println(n+" is Palindrome");
	else
	    System.out.println(n+" is not Palindrome");
    }
}
//05/08/22
//javac Palindrome.java
//java Palindrome