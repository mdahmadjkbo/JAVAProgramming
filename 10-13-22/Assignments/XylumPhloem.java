import java.util.Scanner;

class XylumPhloem{

    static void printXylumPhloem(int n){
	int r, as=0, ms=0, t=n;
	while(n!=0){
	    r=n%10;
	    int amsum=(t==n||r==n)?as+=r:ms+=r;
	    n/=10;}
	String xp=(as==ms)?"Xylum":"Phloem";
	    System.out.println(t+" : "+xp+" Number.");}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number to check Xylum or Phloem number.");
	int n=sc.nextInt();//23456

	printXylumPhloem(n);}
}