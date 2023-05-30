import java.util.Scanner;

class BiggestDigit{
    public static int getBiggest(int n){
	int big=-9, r;
	do{
	    r=n%10;
	    if(r>big)
		big=r;
	    n/=10;
	}while(n!=0);

	return big;}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enetr the number:");
	int n=sc.nextInt();
	int big=getBiggest(n);
	    System.out.println(big+" : Biggest digit of the number "+n);}
}