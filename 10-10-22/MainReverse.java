import java.util.Scanner;

class MainReverse{

    static int getReverse(int n){//12345
	int r, rev=0;
	do{
	    r=n%10;
	    rev=rev*10+r;
	    n/=10;
	}while(n!=0);
    return rev;}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number to reverse: ");
	int n=sc.nextInt();

	int rev=getReverse(n);
	    System.out.println("Reverse of the number "+n+" : "+rev);}
}