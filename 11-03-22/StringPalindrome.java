import java.util.Scanner;

class StringPalindrome{
    public static void printPalindrome(){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the String to check the String is Palindrome or not:");
	String st=sc.next();
	int i=0, j=st.length()-1;
	while(i<j){
	    if(st.charAt(i)!=st.charAt(j)){
		System.out.println(st+": not Palindrome");
		return;}
	    i++;
	    j--;}
	System.out.println(st+": Palindrome");}

    public static void main(String[]args){
	printPalindrome();}
}