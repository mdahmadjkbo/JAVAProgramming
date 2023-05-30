import java.util.Scanner;
class MainEvenOddArray{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no.");
	int i=sc.nextInt();
	String[]st={"even", "odd"};
	    System.out.println(i+" is an "+st[i%2]+" no.");}
}