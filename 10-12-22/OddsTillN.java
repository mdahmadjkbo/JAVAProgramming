import java.util.Scanner;

class OddsTillN{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number n:");
	int n=sc.nextInt();
	    System.out.println("Odd Numbers between 1 to "+n);

	int count=0;
	for(int i=1; i<=n; i+=2){
	    count++;
	    System.out.print(i+" ");}

	System.out.println();
	System.out.println("Total counts of Odd numbers between 1 to "+n+" : "+count);}
}