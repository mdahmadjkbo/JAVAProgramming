import java.util.Scanner;

class PrimeNumbers{

    static boolean isPrimes(int i){
	for(int d=2; d<=i/2; d++){
	    if(i%d==0)
		return false;}
    return true;}

    static void printPrimes(int n){
	int sum=0, count=0;
	for(int i=1; i<=n; i++){
	boolean primes=isPrimes(i);//6
	if(primes){
	    count++;
	    System.out.print(i+" ");
	    sum+=i;}
	}
	
	System.out.println();
	System.out.println("Total count of Prime Numbers: "+count);
	System.out.println("Summation of all the Prime Numbers: "+sum);}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Number to check Prime Numbers within n:");
	int n=sc.nextInt();//15

	printPrimes(n);}
}