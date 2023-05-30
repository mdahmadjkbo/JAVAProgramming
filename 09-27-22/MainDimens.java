import java.util.Scanner;
class MainDimens{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the amount");
	int i=sc.nextInt();
	    System.out.println("No. of Rs2000 notes is: "+i/2000);
	    i%=2000;
	    System.out.println("No. of Rs500 notes is: "+i/500);
	    i%=500;
	    System.out.println("No. of Rs200 notes is: "+i/200);
	    i%=200;
	    System.out.println("No. of Rs100 notes is: "+i/100);
	    i%=100;
	    System.out.println("No. of Rs50 notes is: "+i/50);
	    i%=50;
	    System.out.println("No. of Rs20 notes is: "+i/20);
	    i%=20;
	    System.out.println("No. of Rs10 notes is: "+i/10);
	    i%=10;
	    System.out.println("No. of Rs5 notes is: "+i/5);
	    i%=5;
	    System.out.println("No. of Rs2 notes is: "+i/2);
	    i%=2;
	    System.out.println("No. of Rs1 notes is: "+i);}
}