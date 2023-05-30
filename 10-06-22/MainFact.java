import java.util.Scanner;
class MainFact{
    
    static int getFact(int n){
	int fact=1;
	while(n>1){
	    fact=fact*n;
	    n--;}
	return fact;}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number:");
	int n=sc.nextInt();
	int fact=getFact(n);
	    System.out.println("Factorial of "+n+" :"+fact);
    }
}