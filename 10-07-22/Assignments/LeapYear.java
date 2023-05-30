import java.util.Scanner;
class LeapYear{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the year:");
	int i=sc.nextInt();
	String y=(i%4==0&&i%100!=0||i%400==0)?"":"Not ";
	    System.out.println(i+" : "+y+"a Leap Year.");
    }
}
	    
	    