import java.util.Scanner;
class MainPosInt{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
    System.out.println("enter the Integer.");
	int i=sc.nextInt();
	if(i<0)
	    i=-i;
	System.out.println("The entered Integer is: "+i);}
}