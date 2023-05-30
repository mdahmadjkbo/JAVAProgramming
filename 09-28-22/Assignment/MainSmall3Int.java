import java.util.Scanner;
class MainSmall3Int{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the 3 Integers");
	int i1=sc.nextInt();
	int i2=sc.nextInt();
	int i3=sc.nextInt();
	int bs=i1;
	if(i2<bs)
	    bs=i2;
	if(i3<bs)
	    bs=i3;
	    System.out.println("The smallest no. among all the 3 integers is: "+bs);}
}
	    