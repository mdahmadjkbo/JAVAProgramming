import java.util.Scanner;
class MainWeds{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the no.");
	int i=sc.nextInt();

	if(i%3==0 && i%5==0)
	//conditions 3&&5 should be a 1st condition, as compilor compiles from top to bottom, accordingly the class file containing Byte-codes will be 	generated & then executed.
	    System.out.println(i+" no. shows Sanju weds Gita.");

	else if(i%3==0)
	    System.out.println(i+" no. shows Sanju.");

	else if(i%5==0)
	    System.out.println(i+" no. indicates Gita.");

	else
	    System.out.println(i+" no. leads to Breakup.");}
}