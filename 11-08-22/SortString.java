import java.util.Scanner;
import java.util.Arrays;

class SortString{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the String to be Sorted:");
	String st=sc.nextLine();
	st=st.toLowerCase();
	char[]ch=st.toCharArray();
	Arrays.sort(ch);
	st=new String(ch);
	    System.out.println("Sorted-String:");
	    System.out.println(st);}
}