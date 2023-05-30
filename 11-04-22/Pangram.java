import java.util.Scanner;

class Pangram{
    public static void printPangram(){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the String to check Pangram or not:");
	String st=sc.nextLine();
	sc.close();
	if(st.length()<26){
	    System.out.println("The String is not a Pangram.");
	    return;}
	int[]count=new int[26];
	for(int i=0; i<st.length(); i++){
	    char ch=st.charAt(i);
	    if(ch>='A'&&ch<='Z') count[ch-65]++;
	    else if(ch>='a'&&ch<='z') count[ch-97]++;}
	for(int i=0; i<count.length; i++){
	    if(count[i]==0){
		System.out.println("The String is not a Pangram.");
		return;}
	}
	System.out.println("The String is a Pangram.");
    }

    public static void main(String[]args){
	printPangram();}
}