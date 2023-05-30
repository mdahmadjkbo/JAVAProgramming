import java.util.Scanner;
class MainLeapYr{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Year to find out wheter it's a Leap-yr or not?");
	int i=sc.nextInt();

	if(i>0){
	    if((i%4==0 && i%100!=0) || i%400==0)
	    System.out.println(i+"th Year is a Leap year.");

	    else
	    System.out.println(i+"th Year isn't a Leap Year.");}

	else
	    System.out.println(i+"th Year is not a valid year!");}
}