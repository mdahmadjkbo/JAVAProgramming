import java.util.Scanner;

class DecToBin{

    static void getBin(int dec){
	String bin="";
	do{
	    bin=dec%2+bin;
	    dec/=2;
	}while(dec!=0);
	System.out.println(bin);}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the Decimal no. to print the Equivalent Binary no.:");
	int dec=sc.nextInt();
	getBin(dec);}
}