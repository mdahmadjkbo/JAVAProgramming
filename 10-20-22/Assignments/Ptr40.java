import java.util.Scanner;

class Ptr40{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number:");
	int n=sc.nextInt();
	int sp=n/2, st=1;
	for(int i=1; i<=n; i++){
	    for(int j=1; j<=sp; j++)
		System.out.print("  ");
	    int x=sp+1;
	    for(int j=1; j<=st; j++){
		if(j==1||j==st)
		    System.out.print("* ");
		else
		    System.out.print("  ");}
	    if(i<=n/2){
		sp--;
		st+=2;}
	    else{
		sp++;
		st-=2;}
	System.out.println();}
    }
}