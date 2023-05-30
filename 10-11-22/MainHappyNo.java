import java.util.Scanner;

class MainHappyNo{

    static boolean isHappy(int n){
	while(n>9){
	    int r, sum=0;
	    while(n!=0){
		r=n%10;
		sum=sum+r*r;
		n/=10;}
	n=sum;}
    return n==1||n==7;}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number to check the Happy Number:");
	int n=sc.nextInt();

	boolean happ=isHappy(n);
	String res=happ?"":"not ";
	    System.out.println(n+" : "+res+"a Happy Number.");}
}