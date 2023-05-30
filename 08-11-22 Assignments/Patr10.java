import java.util.Scanner;
class Patr10{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n: ");
    int n=sc.nextInt();//10
    for(int i=1; i<=n; i++){
	for(int j=1; j<=n; j++){
	    System.out.print(j%2+" ");}
	System.out.println();}
    }
}
//javac Patr10.java
//java Patr10
//11-10-22