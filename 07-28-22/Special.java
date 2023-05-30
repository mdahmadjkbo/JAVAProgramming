import java.util.Scanner;
class Special
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Integer Value");
	int i=sc.nextInt();
	int i1=i/10;
	int i2=i%10;
	int sum=(i1+i2)+(i1*i2);
	//while()
	    if(sum==i)
		System.out.println(i+" is an Special 2 Digit No.");
	    else
		System.out.println(i+" is not a Special 2 Digit No.");
    }
}
//28/07/22
//javac Special.java
//java Special