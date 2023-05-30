import java.util.Scanner;
class Patr20{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n: ");
    int n=sc.nextInt();//20
    for(int i=1; i<=n; i++){
	for(int j=i; j>=1; j--){
	    System.out.print((char)(96+j)+" ");}
	System.out.println();}
    }
}
//javac Patr20.java
//java Patr20
//11-020-22