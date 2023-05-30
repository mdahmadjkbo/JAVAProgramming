import java.util.Scanner;
class Patr9{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n: ");
    int n=sc.nextInt();//9
    for(int i=1; i<=n; i++){
	for(int j=i; j>=1; j--){
	    System.out.print(j+" ");}
	System.out.println();}
    }
}
//javac Patr9.java
//java Patr9
//11-09-22