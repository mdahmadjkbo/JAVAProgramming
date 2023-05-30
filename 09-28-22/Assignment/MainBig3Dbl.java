import java.util.Scanner;
class MainBig3Dbl{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the 3 nos.");
	double d1=sc.nextDouble();
	double d2=sc.nextDouble();
	double d3=sc.nextDouble();
	double bs=d1;
	if(d2>bs)
	    bs=d2;
	if(d3>bs)
	    bs=d3;
	    System.out.println("The biggest no. among all the 3 nos. is: "+bs);}
}
	    