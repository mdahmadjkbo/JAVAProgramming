import java.util.Scanner;

class PerfectNo{

    static void printPerfectNo(int n){
	int i=1, sum=0, count=1;
	for(; i<=n/2; i++){
	    if(n%i==0){
		count++;
		sum+=i;}
	}
	String res=(sum==n)?"":"not ";
	    System.out.println(n+" : "+res+"a Perfect Number.");}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number to check Perfect Number:");
	int n=sc.nextInt();
	printPerfectNo(n);}
}