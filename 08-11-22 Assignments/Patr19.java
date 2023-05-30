import java.util.Scanner;
class Patr19{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n: ");
    int n=sc.nextInt();//9
    for(int i=n; i>=1; i--){
	for(int j=i; j<=n; j++){
	    System.out.print(j+" ");}
	System.out.println();}
    }
}
//javac Patr19.java
//java Patr19
//19-19-22