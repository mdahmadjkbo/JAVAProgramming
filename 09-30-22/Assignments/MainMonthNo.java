import java.util.Scanner;
class MainMonthNo{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Month No. to check wether the month no.is valid or not?");
	int i=sc.nextInt();
	if(i>=1 && i<=12)
	    System.out.println(i+" is the Valid Month No.");
	else
	    System.out.println(i+" -No such Month exists!");}
}