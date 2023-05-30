import java.util.Scanner;
class SmallestOf3Nos{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the 3 nos");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int small=(a<b)?((a<c)?a:c):((b<c)?b:c);

	System.out.println("Smallest among the 3 nos: "+small);}
}
	    
	    