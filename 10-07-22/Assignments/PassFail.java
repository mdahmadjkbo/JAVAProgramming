import java.util.Scanner;
class PassFail{

    static String getResult(int w, int x, int y, int z){
	if(w<35||x<35||y<35||z<35)
	    return "Fail";

	double per=(w+x+y+z)/4.0;
	    if(per>=85)
		return "Distinction";

	    if(per>=60)
		return "FirstClass";

	    if(per>=50)
		return "SecondClass";

	    return "Pass";}

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the no:");
	int p=sc.nextInt();
	int c=sc.nextInt();
	int m=sc.nextInt();
	int b=sc.nextInt();

	String res=getResult(p, c, m, b);
	    System.out.println(res);}
}	