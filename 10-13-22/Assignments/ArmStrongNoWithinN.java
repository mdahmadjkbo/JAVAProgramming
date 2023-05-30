import java.util.Scanner;

class ArmStrongNoWithinN{

    static int countDigits(int i){
	int count=0;
	while(i>0){
	    i/=10;
	    count++;}
    return count;}

    static int rrr(int r, int p){
	int prod=1;
	while(p>0){
	    prod*=r;
	    p--;}
    return prod;}

    static boolean isArmStrong(int i){
	int p=countDigits(i);
	int r, sum=0, temp=i;
	while(i>0){
	    r=i%10;
	    sum+=rrr(r, p);
	    i/=10;}
    return sum==temp;}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the value of n to find the nos of ArmStrong nos within n:");
	int n=sc.nextInt();//1998

	for(int i=1; i<=n; i++){
	    boolean arm=isArmStrong(i);
	    if(arm)
		System.out.print(i+" ");}
    }
}
	