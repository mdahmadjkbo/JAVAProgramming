import java.util.Scanner;

class MainStrongNo{

    static int getFact(int r){
	int prod=1;
	while(r>1){
	    prod*=r;
	    r--;}
    return prod;}

    static boolean isStrong(int n){
	int r, sum=0, temp=n;
	do{
	    r=n%10;
	    sum+=getFact(r);
	    n/=10;
	}while(n!=0);
    return temp==sum;}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number to check the Strong Number:");
	int n=sc.nextInt();

	boolean strong=isStrong(n);
	String res=strong?"":"not ";
	    System.out.println(n+" : "+res+"a Strong Number.");}
}