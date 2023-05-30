import java.util.Scanner;

class MainLuckyNo{

    static boolean isLucky(int n){
	while(n>9){
	int r, sum=0;
	do{
	    r=n%10;
	    sum+=r;
	    n/=10;
	}while(n!=0);
	n=sum;}
    return n==9;}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number to check the number is Lucky:");
	int n=sc.nextInt();

	boolean luk=isLucky(n);
	String res=luk?"":"not ";
	    System.out.println(n+" : "+res+"a Lucky Number.");}
}