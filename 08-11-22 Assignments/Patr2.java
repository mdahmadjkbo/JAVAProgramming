import java.util.Scanner;
class Patr2{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n: ");
    int n=sc.nextInt();//5
    for(int i=n; i>=1; i--){
	for(int j=1; j<=i; j++){
	    System.out.print((char)(j+64)+" ");}
	System.out.println();}
    }
}
//javac Patr2.java
//java Patr2
//11-08-22