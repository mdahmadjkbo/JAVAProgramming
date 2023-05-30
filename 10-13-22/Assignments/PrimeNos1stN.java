import java.util.Scanner;

class PrimeNos1stN{

    static boolean isPrimes(int i){
	for(int d=2; d<=i/2; d++){
	    if(i%d==0)
		return false;}
    return true;}

    static void printNPrimes(int n){
	int i=1, count=0, sum=0;
	for(; n>0; i++){
	    boolean prime=isPrimes(i);
	    if(prime){
		System.out.print(i+" ");
	    count++;
	    sum+=i;
	    n--;}
	}
	    System.out.println();
	    System.out.println("Count of all the Prime Numbers: "+count);
	    System.out.println("Sum of all the Prime Numbers: "+sum);}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the value of n to print 1st n Prime nos.");
	int n=sc.nextInt();//1786

	printNPrimes(n);}
}