import java.util.Scanner;

class MultiplyNoPowerTimes{

    static int getPow(int n, int p){
	int pw=1;
	while(p>0){
	    pw*=n;
	    p--;}
	return pw;}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Number & Power to get its n^p");
	int n=sc.nextInt();
	int p=sc.nextInt();

	int pow=getPow(n, p);
	    System.out.println("Multiplication of the number "+n+", Power "+p+" times: "+pow);}
}