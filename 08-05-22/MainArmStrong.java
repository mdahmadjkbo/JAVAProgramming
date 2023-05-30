import java.util.Scanner;
class MainArmStrong
{
    static boolean isArmStrong(int x)//(3 digits)x=153=1³+5³+3³=153
    {
	int sum=0,temp=x;// ???Declaring & Initializing 2 variables & values, ???n-no. is possible?
	do{
	    int r=x%10;//r-digit, % op.-Remainder, 1st iteration=3 //2nd=5 //3rd=1
	    sum=sum+r*r*r;//1st=0+3*3*3=3³ //2nd=3³+5³ //3rd=3³+5³+1³
	    x=x/10;//(to eliminate previous r)x-any int no. by user, / op.-Quotient, 153/10=15 //15/10=1 //1/10
	}while(x!=0);//(condition to stop execution), ???or (x>0)
    	if(sum==temp)
	    return true;//???why return
	else
	    return false;
    }
    public static void main(String[]args)//???how both the methods are connected
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no.: ");
	int n=sc.nextInt();
	boolean rs=isArmStrong(n);//(n- input, rs- output) ???Reinitializing isArmStrong Method, ???x or int x, instead of n- not possible?, ???directs to isArmStrong Method?
	if(rs==true)
	    System.out.println(n+" is an ArmStrong no.");//???x, instead of n?
	else
	    System.out.println(n+" is not an ArmStrong no.");
    }
}//???CTE
//05/08/22
//javac MainArmStrong.java
//java MainArmStrong