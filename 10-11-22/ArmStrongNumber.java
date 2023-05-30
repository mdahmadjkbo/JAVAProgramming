import java.util.Scanner;

class ArmStrongNumber{

    static int countDigits(int n){
	int count=0;
	for(; n!=0; n/=10)
	    count++;
    return count;}

    static int rrr(int r, int p){
	int prod=1;
	for(; p>0; p--)
	    prod*=r;
    return prod;}

    static boolean isArmStrong(int n){
	int p=countDigits(n);
	int r, sum=0, temp=n;
	for(; n!=0; n/=10){
	    r=n%10;
	    sum+=rrr(r, p);}
    return sum==temp;}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number to Check ArmStrong Number:");
	int n=sc.nextInt();

	boolean arm=isArmStrong(n);
	String res=arm?"":"not ";
	    System.out.println(n+" : "+res+"an ArmStrong Number.");}
}