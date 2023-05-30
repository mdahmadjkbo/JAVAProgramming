import java.util.Scanner;
class MainReverse//???class- with lower c?
{
    static int reverse(int x)//395
    {
	int rev=0;
	do{
	    int r=x%10;//5//9//3
	    rev=rev*10+r;//0*10+5=5//5*10+9=59//59*10+3=593
	    x=x/10;//??2nd. x then 3rd. rev(exchange)?
	}while(x!=0);
    return rev;//???after calculating, rev will be assigned with new value?
    }
    public static void main(String[]args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no.: ");
	int n=sc.nextInt();
	int rv=reverse(n);
	System.out.println("Reverse of "+n+" is: "+rv);
    }
}
//05/08/22
//javac MainReverse.java
//java MainReverse
