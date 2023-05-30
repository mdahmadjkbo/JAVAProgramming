import java.util.Scanner;
class Special2DigitNo{
    public static int isSpecial(int x){
	int sum=((x/10)+(x%10))+((x/10)*(x%10));
	    return sum;}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the 2 digits no:");
	int x=sc.nextInt();

	if(x>=10 && x<=99){
	int sp=isSpecial(x);
	String res=(sp==x)?"":" not";
	    System.out.println(x+" :"+res+" a Special 2 digits no.");}

	else
	    System.out.println("enter 2 digits number between 10 to 99.");}
}