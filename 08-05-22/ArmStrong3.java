import java.util.Scanner;
class ArmStrong3{
static boolean armStrong(int x){//153
    int sum=0, temp=x;
    do{
	int r=x%10;//3//5//1
	sum=sum+r*r*r;
	x=x/10;//15//1//0
    }while(x!=0);
    if(sum==x)
	return true;
    else
	return false;}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter any 3 digit no: ");
int n=sc.nextInt();
boolean rs=armStrong(n);
    if(rs==true)
	System.out.println(n+" is an ArmStrong no.");
    else
	System.out.println(n+" is not an ArmStrong no.");}
}
//javac ArmStrong3.java
//java ArmStrong3
    