import java.util.Scanner;
class PatrSp2{
public static void main(String[]args){
System.out.println("enter the no: ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1; i<=n; i++){
    for(int j=1; j<=n; j++){
    if(i==1||i==n||j==1||j==n||i==n/2+1||j==n/2+1)
	System.out.print("* ");
    else
	System.out.print("  ");}
    System.out.println();}
    }
}
//javac PatrSp2.java
//java PatrSp2