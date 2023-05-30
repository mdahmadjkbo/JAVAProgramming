import java.util.Scanner;
class DigitsProduct{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the no>0");
	int pn=sc.nextInt();//253
	int n=(pn>0)?pn:-pn;

	int dr, prod=1;
	while(n>0){
	    dr=n%10;
	    prod*=dr;
	    n/=10;}

	int prodpn=(pn>0)?prod:-prod;
	    System.out.println("the product of digits of the no. "+n+" : "+prodpn);}
}
	    
	    