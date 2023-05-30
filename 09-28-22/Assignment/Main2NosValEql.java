import java.util.Scanner;
class Main2NosValEql{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 2 Integers");
	int x=sc.nextInt();
	int y=sc.nextInt();
	//int xp=x;
	//int yp=y;
	if(x<0)
	    x=-x;
	if(y<0)
	    y=-y;

	if(x==y)
	System.out.println("value of both the integers "+x+" & "+y+" is: equal.");
	
	if(x!=y)
	System.out.println("value of both the integers "+x+" & "+y+" is: not equal.");}
}
	