import java.util.Scanner;
class MainLenCmFtM{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println();
	    System.out.print("Input: ");
	int cm=sc.nextInt();
	int m=cm/100;
	double ft=cm/30.48;
	    System.out.println();
	    System.out.println("Output: In Meter: "+m+" meter");
	    System.out.println();
	    System.out.println("      In Foot: "+ft+" Foot");}
}
 