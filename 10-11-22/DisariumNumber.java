import java.util.Scanner;

class DisariumNumber{

    static int countDigits(int n){
	int count=0;
	for(;n!=0; n/=10)
	    count++;
    return count;}

    static int rrr(int r, int p){
	int prod=1;
	for(; p>0; p--)
	    prod*=r;
    return prod;}

    static boolean isDisarium(int n){
	int p=countDigits(n);
	int rpn, r, sum=0, temp=n;
	for(; n!=0; n/=10){
	    rpn=n%10;
	    r=(rpn>0)?rpn:-rpn;
	    sum+=rrr(r, p);
	    p--;}
    return sum==temp;}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number to Check Disarium Number:");
	int n=sc.nextInt();

	boolean dis=isDisarium(n);
	String res=dis?"":"not ";
	    System.out.println(n+" : "+res+"a Disarium Number.");}
}