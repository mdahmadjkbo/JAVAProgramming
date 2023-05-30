import java.util.Scanner;

class OctalToDecimal{
    public static void printOctalToDecimal(int oct){
		System.out.println("oct: "+oct);
	int r, dec=0, pw=1, temp=oct;
		System.out.println("temp: "+temp);
	do{
	    r=oct%10;
		System.out.println("r: "+r);

	    if(r>-8&&r<8){
		dec+=(r*pw);
		System.out.println("dec: "+dec);
		pw*=8;
		System.out.println("pw: "+pw);
		oct/=10;
		System.out.println("oct: "+oct);}

	    else{
		System.out.println("enter the Octal number(all the digits between 0 & 7) only");
		return;}
	}while(oct!=0);
    System.out.println("Decimal Equivalent of the Octal no. "+temp+": "+dec);}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the Octal number(all the digits between 0 & 7) to convert into Decimal number:");
	int n=sc.nextInt();
	printOctalToDecimal(n);}
}