import java.util.Scanner;
class SumOfDigitsOfNo{
    public static int getSum(int n){
	int sum=0;
	do{
	    int r=n%10;//5
	    sum+=r;
	    n/=10;
	}while(n!=0);
    return sum;
    }

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the no:");
	int n=sc.nextInt();//12345

	//int pn=(n>0)?n:-n;
	int sum=getSum(n);

	//int sumpn=(n>0)?sum:-sum;
	    System.out.println("Sum of all the digits of the no: "+sum);}
}