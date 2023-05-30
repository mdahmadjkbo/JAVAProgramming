import java.util.Scanner;
class Patr8{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n: ");
    int n=sc.nextInt();//8
    for(int i=1; i<=n; i++){
	for(int j=1; j<=i; j++){
	    System.out.print(i%2+" ");}
	System.out.println();}
    }
}
//javac Patr8.java
//java Patr8
//11-08-22