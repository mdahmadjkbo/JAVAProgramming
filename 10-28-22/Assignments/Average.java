import java.util.Scanner;

class Average{

    public static int[]readArray(){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter Array-size:");
	int n=sc.nextInt();
	int[]ar=new int[n];
	    System.out.println("enter Array-elements:");
	for(int i=0; i<ar.length; i++)
	    ar[i]=sc.nextInt();
    return ar;}

    public static void printAverage(int[]ar){
	int sum=0, avg;
	for(int i=0; i<ar.length; i++)
	    sum+=ar[i];
	avg=sum/ar.length;
	    System.out.println("Average of the Array elements: "+avg);}

    public static void main(String[]args){
	int[]ar=readArray();
	printAverage(ar);}
}