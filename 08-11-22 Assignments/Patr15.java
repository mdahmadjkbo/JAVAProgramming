import java.util.Scanner;
class Patr15{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n: ");
    int n=sc.nextInt();//5
	System.out.println();
	System.out.println();
    for(int i=1; i<=n; i++){
	for(int j=n; j>=i; j--){
	    System.out.print(j+" ");}
	System.out.println();}
    }
}
//javac Patr15.java
//java Patr15
//15-15-22