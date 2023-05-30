import java.util.Scanner;

class VowCons{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the String to count Vowels & Consonents:");
	String st=sc.nextLine();
	int vc=0, cc=0;
	for(int i=0; i<st.length(); i++){
	    char ch=st.charAt(i);
	    if(ch>='A'&&ch<='Z'){
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') vc++;
		else cc++;}
	    else if(ch>='a'&&ch<='z'){
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') vc++;
		else cc++;}
	}
	System.out.println("Total of Vowel-counts presnt in the String: "+vc);
	System.out.println("Total of Consonents-counts presnt in the String: "+cc);
    }
}