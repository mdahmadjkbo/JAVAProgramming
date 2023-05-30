import java.util.Scanner;

class ArmStrongOf3DigitsNo{

    static boolean isArmStrong(int n){
	int r, sum=0, temp=n;
	while(n!=0){
	    r=n%10;
	    sum=sum+r*r*r;
	    n/=10;}
	return sum==temp;}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the 3 digits number to check ArmStrong Number.");
	int n=sc.nextInt();

	if((n>=100 && n<=999)||(n<=-100 && n>=-999)){
	    boolean arm=isArmStrong(n);
	    String res=arm?"":"not ";
		System.out.println(n+" : "+res+"an ArmStrong number.");}
	else
		System.out.println("Enter only 3 digits number.");}
}