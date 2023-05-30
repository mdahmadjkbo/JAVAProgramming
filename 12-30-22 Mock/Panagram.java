import java.util.Scanner;

class Panagram{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the String to check Panagram:");
	String st=sc.nextLine();
	sc.close();
	if(st.length()<26){
	    System.out.println("The entered String is not Panagram!");
    return;}
	int[]count=new int[26];
	for(int i=0; i<st.length(); i++){
	    char ch=st.charAt(i);
	    if(ch>='a'&&ch<='z') count[ch-97]++;
	    else if(ch>='A'&&ch<='Z') count[ch-65]++;}	
	for(int i=0; i<26; i++){
	    if(count[i]==0){
		System.out.println("The entered String is not Panagram!!");
    return;}
	}
	System.out.println("The entered String is Panagram.");}
}
