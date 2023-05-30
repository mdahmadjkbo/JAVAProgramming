import java.util.Scanner;
class DisariumWithinN{

    public static int countDigit(int i){
	int r, count=0;
	do{
	    r=i%10;
	    count++;
	    i/=10;
	}while(i!=0);
    return count;}

    public static int getProd(int r, int p){
	int rrr=1;
	for(;p!=0;p--)
	    rrr*=r;
    return rrr;}

    public static int getSum(int i){
	int p=countDigit(i);
	int r, sum=0;
	for(;i>0;i/=10){
	    r=i%10;
	    sum+=getProd(r, p);
	    p--;}
    return sum;}

    public static void printDisarium(){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enetr the number:");
	int n=sc.nextInt(), sum, summ=0, count=0;
	    System.out.println();
	    System.out.print("Disarium Numbers within "+n+": ");
	for(int i=1;i<=n;i++){
	    sum=getSum(i);
	    if(sum==i){
		count++;
	    System.out.print(i+" ");
		//sum=i;
		summ+=i;}//!?
	}
	    System.out.println();
	    System.out.println("Total counts of all the Disarium Numbers: "+count);
	    System.out.println("Sum of all the Disarium Numbers within "+n+": "+summ);}

    public static void main(String[]args){
	printDisarium();}
}