import java.util.Scanner;

class DecimalToHexadecimal{

    static void getHexdec(int dec){
	String hex="";
	do{
	    int h=dec%16;
	    if(h<10)
		hex=h+hex;

	    else if(h==10)
		hex='A'+hex;

	    else if(h==11)
		hex='B'+hex;

	    else if(h==12)
		hex='C'+hex;

	    else if(h==13)
		hex='D'+hex;

	    else if(h==14)
		hex='E'+hex;

	    else if(h==15)
		hex='F'+hex;

	    dec/=16;
	}while(dec!=0);
	System.out.println(hex);}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the Decimal no. to print the Equivalent HexaDecimal no.:");
	int dec=sc.nextInt();
	getHexdec(dec);}
}












