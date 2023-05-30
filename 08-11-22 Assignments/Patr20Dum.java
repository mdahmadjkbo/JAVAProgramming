import java.util.Scanner;
class Patr20Dum{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n: ");
    int n=sc.nextInt();//9
    for(int i=n; i>=1; i--){
	for(int j=i; j<=n; j++){
	    System.out.print((char)(j+96)+" ");}//a=95
	System.out.println();}
    }
}
//javac Patr20Dum.java
//java Patr20Dum
//20-20-22