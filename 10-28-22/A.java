import java.util.Scanner;

class A{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size of the Array:");
	int n=sc.nextInt();
	int[]ar=new int[n];
	    System.out.println("enter the integer values:");
	for(int i=0; i<ar.length; i++)
	    ar[i]=sc.nextInt();
	int sum=0;
	for(int i=0; i<ar.length;i++)
	    sum+=ar[i];
	System.out.println("Sum: "+sum);}
}
