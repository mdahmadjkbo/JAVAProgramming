import java.util.Scanner;
class Patr6{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n: ");
    int n=sc.nextInt();//6
    for(int i=1; i<=n; i++){
	for(int j=1; j<=i; j++){
	    System.out.print((char)(j+64)+" ");}
	System.out.println();}
    }
}
//javac Patr6.java
//java Patr6
//11-08-22