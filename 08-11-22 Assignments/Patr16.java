import java.util.Scanner;
class Patr16{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n: ");
    int n=sc.nextInt();//6
    for(int i=1; i<=n; i++){
	for(int j=n; j>=i; j--){
	    System.out.print(i%2+" ");}
	System.out.println();}
    }
}
//javac Patr16.java
//java Patr16
//16-16-22