import java.util.Scanner;

class Anagram{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter both the Strings to check Anagram:");
	String a=sc.nextLine();
	String b=sc.nextLine();
	int[]ac=count(a);
	int[]bc=count(b);
	for(int i=0; i<26; i++){
	    if(ac[i]!=bc[i]){
		System.out.println("Both the Strings aren't Anagram!");
    return;}
	}
	System.out.println("Both the Strings are Anagram.");}

    public static int[] count(String st){
	int[]count=new int[26];
	for(int i=0; i<st.length(); i++){
	    char ch=st.charAt(i);
	    if(ch>='A'&&ch<='Z') count[ch-65]++;
	    else if(ch>='a'&&ch<='z') count[ch-97]++;}
    return count;}
}