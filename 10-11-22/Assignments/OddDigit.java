import java.util.Scanner;

class OddDigit{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number to count Odd digits present in the number.");
	int n=sc.nextInt();

	int ocount=0, r;
	while(n!=0){
	    r=n%10;
	    if(r%2==1||r%2==-1) ocount++;
	    n/=10;}

	System.out.println("Count of Odd digits present in the numer: "+ocount);}
}