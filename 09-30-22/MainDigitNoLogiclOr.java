import java.util.Scanner;
class MainDigitNoLogiclOr{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Integer.");
	int i=sc.nextInt();
	if(i<-9 || i>9)
	    System.out.println(i+" is a No.");
	else
	    System.out.println(i+" is a Digit.");}
}