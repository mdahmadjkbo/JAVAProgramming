import java.util.Scanner;
class Alpha{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n: ");
    int n=sc.nextInt();//5
    //System.out.println("enter the value of n: ");
    for(int i=1; i<=n; i++){
	for(int j=1; j<=n; j++){//j<=i
	    System.out.print((char)(i+64)+"");}
	System.out.println();}
    }
}
//javac Alpha.java
//java Alpha
//11-08-22