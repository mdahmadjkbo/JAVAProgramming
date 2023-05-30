import java.util.Scanner;
class Patr18{
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
//javac Patr18.java
//java Patr18
//18-18-22