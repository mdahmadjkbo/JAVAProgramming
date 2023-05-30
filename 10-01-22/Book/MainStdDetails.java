import java.util.Scanner;
class MainStdDetails{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the name:");
	String name=sc.nextLine();
	    System.out.println("Enter the mobile number:");
	long mob=sc.nextLong();
	    System.out.println("Enter 10th percentage:");
	double ten=sc.nextDouble();
	    System.out.println("Enter 12th percentage:");
	double twel=sc.nextDouble();
	    System.out.println("Enter Degree percentage:");
	double deg=sc.nextDouble();

	System.out.println("========Student's Details========");
	System.out.println("Name: "+name);
	System.out.println("Mobile Number: "+mob);
	System.out.println("10th: "+ten);
	System.out.println("12th: "+twel);
	System.out.println("Degree: "+deg);}
}
