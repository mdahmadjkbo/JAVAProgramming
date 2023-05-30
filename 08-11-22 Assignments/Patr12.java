import java.util.Scanner;
class Patr12{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n: ");
    int n=sc.nextInt();//5
    for(int i=1; i<=n; i++){
	for(int j=n; j>=i; j--){
	    System.out.print(j+" ");}
	System.out.println();} 
    }
}
//javac Patr12.java
//java Patr12
//12-12-22