import java.util.Scanner;
class MainEvenOddSwitchCase{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no.");
	int i=sc.nextInt();
	switch(i%2){
	case 0:
	    System.out.println(i+" is an Even no.");
	break;
	case 1:
	    System.out.println(i+" is an Odd no.");}
    }
}