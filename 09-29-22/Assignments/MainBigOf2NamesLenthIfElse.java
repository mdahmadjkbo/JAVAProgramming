import java.util.Scanner;
class MainBigOf2NamesLenthIfElse{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter both the 2 Names to compare the lengths.");
	String a=sc.nextLine();
	String b=sc.nextLine();
	if(a.length()>b.length())
	    System.out.println(a+" is greater & the length is: "+a.length());
	else if(a.length()==b.length())
	    System.out.println(a+" & "+b+" is equal to "+a.length());
	else
	    System.out.println(b+" is greater & the length is: "+b.length());}
}
	    