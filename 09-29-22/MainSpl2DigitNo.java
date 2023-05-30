import java.util.Scanner;
class MainSpl2DigitNo{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 2 digit no.");
	int i=sc.nextInt();
	int d1=i/10;
	int d2=i%10;
	int sum=d1*d2+d1+d2;
	if(i==sum)
	    System.out.println("The entered no. "+i+" is a Special 2 digits no.");
	else
	    System.out.println("The entered no. "+i+" is not a Special 2 digits no.");}
}