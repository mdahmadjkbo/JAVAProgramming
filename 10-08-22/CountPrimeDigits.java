import java.util.Scanner;
class CountPrimeDigits{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the no:");
	int n=sc.nextInt();
	int pc=0;
	while(n!=0){
	    int r=n%10;
	    if(r==1||r==2||r==3||r==5||r==7)
		pc++;
	    n/=10;}
	System.out.println(pc);}
}	