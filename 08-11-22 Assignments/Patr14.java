import java.util.Scanner;
class Patr14{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n: ");
    int n=sc.nextInt();//5
    for(int i=n; i>=1; i--){
	for(int j=n; j>=i; j--){
	    System.out.print(j+" ");}
	System.out.println();} 
    }
}
//javac Patr14.java
//java Patr14
//14-14-22