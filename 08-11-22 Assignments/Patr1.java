import java.util.Scanner;
class Patr1{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n: ");
    int n=sc.nextInt();//5
    for(int i=1; i<=n; i++){
    //for(int i=n; i>=1; i--){
	for(int j=i; j<=n; j++){	
    //for(int j=1; j<=i; j++){
	    System.out.print(j+" ");}
	System.out.println();}
    }
}
//javac Patr1.java
//java Patr1
//11-08-22