import java.util.Scanner;
class MainMidOf3Nos{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println();
	    System.out.print("Input: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();


	if((a>b && a<c) || (a<b && a>c)){
	    System.out.println();
	    System.out.println("Output: "+a);}

	else if((b>a && b<c) || (b<a && b>c)){
	    System.out.println();
	    System.out.println("Output: "+b);}

	else if((c>a && c<b) || (c<a && c>b)){
	    System.out.println();
	    System.out.println("Output: "+c);}

	else{
	    System.out.println();
	    System.out.println("Output:Please enter distinct values");}
    }
}