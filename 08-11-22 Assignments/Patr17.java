import java.util.Scanner;
class Patr17{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n: ");
    int n=sc.nextInt();//7
    for(int i=1; i<=n; i++){
	for(int j=n; j>=i; j--){
	    System.out.print(j%2+" ");}
	System.out.println();}
    }
}
//javac Patr17.java
//java Patr17
//17-17-22