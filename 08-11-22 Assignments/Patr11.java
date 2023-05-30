import java.util.Scanner;
class Patr11{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n: ");
    int n=sc.nextInt();//5
	System.out.println();
	System.out.println();
    int x=0;
    //int x=1;
    for(int i=1; i<=n; i++){
	for(int j=1; j<=n; j++){
	    System.out.print(x%9+1+" ");
	    //System.out.print(x+" ");
	    x++;
	    //if(x==10)
		//x=1;
	}
	System.out.println();}
    }
}
//javac Patr11.java
//java Patr11
//11-11-22