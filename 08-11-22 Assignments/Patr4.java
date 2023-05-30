import java.util.Scanner;
class Patr4{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n: ");
    int n=sc.nextInt();//5
	System.out.println();
	System.out.println();
    for(int i=1; i<=n; i++){
	for(int j=i; j<=n; j++){
	    System.out.print(j+" ");}
	System.out.println();}
    }
}
//javac Patr4.java
//java Patr4
//4-4-22