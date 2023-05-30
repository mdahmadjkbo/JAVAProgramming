import java.util.Scanner;

class ArmStrongNumber{

    static int countDigits(int n){
	int count=0;
	do{
	    n/=10;
	    count++;
	}while(n!=0);
    return count;}

    static int rrr(int r, int p){
	int rr=1;
	while(p>0){
	    rr*=r;
	    p--;}
	return rr;}

    static int getArmStrong(int n){
	int p=countDigits(n);
	int sum=0, r;
	while(n>0){
	    r=n%10;
	    sum+=rrr(r, p);
	    n/=10;}
	return sum;}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number to check ArmStrong.");
	int n=sc.nextInt();//153
	int arm=getArmStrong(n);

	String res=(arm==n)?"":"not ";
	    System.out.println(n+" : "+res+"ArmStrong.");}
}