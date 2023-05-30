import java.util.Scanner;
class MainLeapCondOp{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.print("Input: ");
	int y=sc.nextInt();
	
	if(y>0){
	String sty=(y%4==0 && y%100!=0)? "Leap Year" : (y%400==0)?"Leap Year":"Not a leap year";
	    System.out.println(sty);}
	
	else
	System.out.println("Error!!");}
}