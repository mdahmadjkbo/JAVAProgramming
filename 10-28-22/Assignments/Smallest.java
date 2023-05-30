import java.util.Scanner;

class Smallest{

    public static double[]readArray(){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size of the Array:");
	int n=sc.nextInt();
	double[]arr=new double[n];
	    System.out.println("enter the "+n+" elements to the Array:");
	for(int i=0; i<arr.length; i++){
	    arr[i]=sc.nextDouble();}
    return arr;}

    public static void printSmallest(double[]arr){
	double small=arr[0];
	for(int i=1; i<arr.length; i++){
	    if(arr[i]<small)
		small=arr[i];}
    System.out.println("Smallest among all the numbers: "+small);}

    public static void main(String[]args){
	double[]arr=readArray();
	printSmallest(arr);}
}