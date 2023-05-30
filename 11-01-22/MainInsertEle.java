import java.util.Scanner;

class MainInsertEle{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	ArrayOp ao=new ArrayOp();
	int[]ra=ao.readArray();

	    System.out.println("enter the element to be inserted:");
	int ele=sc.nextInt();
	    System.out.println("enter the index where to be inserted:");
	int in=sc.nextInt();
	ra=ao.insertEle(ra, ele, in);
	ao.dispArray(ra);}
}