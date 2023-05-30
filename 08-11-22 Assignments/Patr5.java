import java.util.Scanner;
class Patr5{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n: ");
    int n=sc.nextInt();//5
	System.out.println();
	System.out.println();
    for(int i=1; i<=n; i++){
	for(int j=1; j<=i; j++){
	    System.out.print(j+" ");}
	System.out.println();}
    }
}
//javac Patr5.java
//java Patr5
//11-08-22