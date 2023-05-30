import java.util.Scanner;
class BiggestOf3Nos{
    public static int getBiggest(int x, int y, int z){
	int big=(x>y)?(x>z?x:z):(y>z?y:z);
	return big;}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the 3 nos:");
	int x=sc.nextInt();
	int y=sc.nextInt();
	int z=sc.nextInt();
	int big=getBiggest(x, y, z);
	    System.out.println("biggest among the 3 nos: "+big);}
}