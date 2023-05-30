import java.util.Scanner;

class FibonacciN{
    static void printFibonacci(int n){
	int f1=0, f2=1, f3;
	while(n>0){
	f3=f1+f2;
	    System.out.print(f1+" ");
	f1=f2;
	f2=f3;
	n--;}
    }

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the value of n to print Fibonacci Numbers upto n:");
	int n=sc.nextInt();//20
	printFibonacci(n);}
}