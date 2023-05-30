import java.util.Scanner;

class Pangram{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the String to check Anagram:");
	String st=sc.nextLine();
	if(st.length()<26){
	    System.out.println("The String is not an Anagram as the String-length is <26!");
	    return;}
	st=st.toLowerCase();
	for(char ch='a'; ch<='z'; ch++){
	    if(st.indexOf(ch)==-1){
		System.out.println("1st '"+ch+"' is Missing!");
		System.out.println("The String is not an Anagram!");
		return;}
	}
	System.out.println("The String is an Anagram.");}
}