import java.util.Scanner;
class MainBigOf2NamesLenthCondOp{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the 2 Names.");
	String a=sc.nextLine();
	String b=sc.nextLine();
	String big=(a.length()>b.length())?a:b;
	    System.out.println(big+" is biggest name.");}
}