import java.util.Scanner;

class NoOfDivisorsOfN{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the value of n to know the Divisors & Number of divisors:");
	int n=sc.nextInt();
	    System.out.println("Divisors of "+n+" :");

	int count=1, divs;
	for(int i=1; i<=n/2; i++){
	    if(n%i==0){
		count++;
		System.out.print(i+" ");}
	}

	System.out.print(n+" ");
	System.out.println();
	System.out.println("Total counts of Divisors of "+n+" : "+count);}
}