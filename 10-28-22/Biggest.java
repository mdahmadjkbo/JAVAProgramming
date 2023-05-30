import java.util.Scanner;

class Biggest{

    public static int[] readArray(){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size of the array:");
	int n=sc.nextInt();
	int[]ar=new int[n];
	    System.out.println("enter the "+n+" Integers to check Biggest:");
	for(int i=0; i<ar.length; i++)
	    ar[i]=sc.nextInt();
    return ar;}

    public static void dispArray(int[]ar){
	for(int i=0; i<ar.length; i++)
	    System.out.print(ar[i]+" ");
	System.out.println();}

    public static int getBiggest(int[]ar){
	int big=ar[0];
	for(int i=0; i<ar.length; i++){
	    if(ar[i]>big)
		big=ar[i];}
    return big;}

    public static void main(String[]args){
	int[]ar=readArray();
	//dispArray(ar);
	int big=getBiggest(ar);
	    System.out.println("Biggest among all the numbers: "+big);}
}