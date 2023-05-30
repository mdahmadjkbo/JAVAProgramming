import java.util.Scanner;
class Biggest{
static int getBig(int[]ar){
    int big=ar[0];
    for(int i=1; i<ar.length; i++){
	if(ar[i]>big)
	big=ar[i];}
    return big;}

public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of the Array:");
    int n=sc.nextInt();
    int[]ar=new int[n];
    System.out.println("enter "+n+" integers:");
    for(int i=0; i<ar.length; i++){
    ar[i]=sc.nextInt();}
    int big=getBig(ar);
    System.out.println("The biggest element of the array is: "+big);}
}