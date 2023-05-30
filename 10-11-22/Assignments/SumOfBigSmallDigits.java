import java.util.Scanner;

class SumOfBigSmallDigits{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number to add biggest & smallest digits of the number.");
	int n=sc.nextInt();//

	int big=-9, small=9, r;
	do{
	    r=n%10;
	    if(r>big) big=r;
	    if(r<small) small=r;
	    n/=10;
	}while(n!=0);

	System.out.println("Addition of Biggest digit "+big+" Smallest digit "+small+" : "+(big+small));}
}
