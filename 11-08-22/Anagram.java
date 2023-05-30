import java.util.Scanner;
import java.util.Arrays;

class Anagram{

    public static void printAnagram(){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter both the Strings to check both the Strings are Anagram or not?");

	String st=sc.nextLine();
	String str=sc.nextLine();

	st=st.replace(" ","");
	str=str.replace(" ","");

	if(st.length()!=str.length()){
	    System.out.println("The strings don't have equal length! So can't be Anagram!");
	    return;}

	st=st.toUpperCase();
	str=str.toUpperCase();

	char[]c=st.toCharArray();
	char[]ch=str.toCharArray();

	Arrays.sort(c);
	Arrays.sort(ch);

	String op=Arrays.equals(c, ch)?"":"not ";
	    System.out.println("Strings are "+op+"Anagram.");}

    public static void main(String[]args){
	printAnagram();}
}