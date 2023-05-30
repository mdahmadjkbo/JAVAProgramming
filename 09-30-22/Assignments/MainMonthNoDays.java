import java.util.Scanner;
class MainMonthNoDays{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Month No. to check wether the month no.is valid or not?");
	int i=sc.nextInt();

	if(i>=1 && i<=12){

	    if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
	    System.out.println(i+" has 31 days.");
	    
	    if(i==4||i==6||i==9||i==11)
		System.out.println(i+" has 30 days.");

	    if(i==2)
		    System.out.println(i+" has 28 or 29 days.");
	}
	else
	    System.out.println(i+" -No such Month exists!");}
}