import java.util.Scanner;

class Anagram{

    public static int[]countFreq(String st){
	int[]count=new int[26];
	for(int i=0; i<st.length(); i++){
	    char ch=st.charAt(i);
	    if(ch>='A'&&ch<='Z') count[ch-65]++;
	    else if(ch>='a'&&ch<='z') count[ch-97]++;}
    return count;}

    public static void printAnagram(){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter both the Strings to compare as Anagram or not:");
	String st=sc.nextLine();
	String str=sc.nextLine();
	sc.close();
	int[]ct=countFreq(st);
	int[]cnt=countFreq(str);
	for(int i=0; i<26; i++){
	    if(ct[i]!=cnt[i]){
		System.out.println("The Strings are not Anagram.");
		return;}
	}
	System.out.println("The Strings are Anagram.");}

    public static void main(String[]args){
	printAnagram();}
}