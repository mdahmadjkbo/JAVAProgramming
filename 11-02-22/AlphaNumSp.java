import java.util.Scanner;

class AlphaNumSp{

    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the String:");
	String st=sc.nextLine();//RaghuGbr@gmail.COM
	int uc=0, lc=0, dc=0, spc=0;
	for(int i=0; i<st.length(); i++){
	    char ch=st.charAt(i);
	    if(ch>='A'&&ch<='Z') uc++;
	    else if(ch>='a'&&ch<='z') lc++;
	    else if(ch>='0'&&ch<='9') dc++;
	    else spc++;}
	System.out.println("Upper Case Letters presnt in the String: "+uc);
	System.out.println("Lower Case Letters presnt in the String: "+lc);
	System.out.println("Digits presnt in the String: "+dc);
	System.out.println("Special Characters presnt in the String: "+spc);}
}