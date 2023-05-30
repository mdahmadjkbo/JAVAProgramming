import java.util.Scanner;
import java.util.Arrays;

class StringSortAsc{

    public static void printStringAsc(){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the String to sort into Ascending-order:");
	String st=sc.nextLine();
	String[]sp=st.split(" ");
	    //System.out.println("sp[]: "+sp);
	Arrays.sort(sp);
	    //System.out.println("Sorted-sp[]: "+sp);
	st="";
	for(int i=0; i<sp.length; i++){
	    st+=sp[i];
	    if(i<sp.length-1) st=sp+"";}
	System.out.println("Sorted-string in Ascending-order:");
	System.out.println(st);}

    public static void main(String[]args){
	printStringAsc();}
}