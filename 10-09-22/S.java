import java.util.Scanner;
class S{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double d=sc.nextDouble();
double small=a;
if(b<small) 
small=b;
if(c<small) 
small=c;
if(c<small) 
small=d;
System.out.println(small);}
}