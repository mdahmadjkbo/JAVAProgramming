import java.util.Scanner;

class EvenTillN{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number n:");
	int n=sc.nextInt();
	    System.out.println("Even Numbers between 0 to "+n);
	for(int i=0; i<=n; i+=2)
	    System.out.print(i+" ");}
}