import java.util.Scanner;

class DecToOct{

    static void getBin(int dec){
	String oct="";
	do{
	    oct=dec%8+oct;
	    dec/=8;
	}while(dec!=0);
	System.out.println(oct);}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the Decimal no. to print the Equivalent Octal no.:");
	int dec=sc.nextInt();
	getBin(dec);}
}