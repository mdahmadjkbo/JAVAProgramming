import java.util.Scanner;

class MainDeleteEle{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	ArrayOp ao=new ArrayOp();
	int[]ra=ao.readArray();

	    System.out.println("enter the index where the element is to be deleted:");
	int in=sc.nextInt();
	ra=ao.delElement(ra, in);
	    System.out.println("Array after deleting the element:");
	ao.dispArray(ra);}
}