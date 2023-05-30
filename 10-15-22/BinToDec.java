import java.util.Scanner;

class BinToDec{
    public static void printBinToDec(int bin){
	int r, dec=0, pw=1, temp=bin;
	do{
	    r=bin%10;
	    if(r==0||r==1||r==-1){
		dec+=(r*pw);
		pw*=2;
		bin/=10;}
	else{
	    System.out.println("enter the Decimal number only in 0, 1");
	    return;}
	}while(bin!=0);
    System.out.println("Decimal Equivalent of the Binary no. "+temp+": "+dec);}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enetr the number Binary number to calculate its decimal equivalent:");
	int n=sc.nextInt();
	printBinToDec(n);}
}