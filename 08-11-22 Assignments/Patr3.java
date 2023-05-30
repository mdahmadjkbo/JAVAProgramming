import java.util.Scanner;
class Patr3{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n: ");
    int n=sc.nextInt();//5
    for(int i=1; i<=n; i++){
	for(int j=n; j>=1; j--){
	    System.out.print(j+" ");}
	System.out.println();}
    }
}
//javac Patr3.java
//java Patr3
//11-08-22