import java.util.Scanner;

class ConvertStringIntoLowerCase{
    public static void printIntoLowerCase(){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the String to convert into Lower-case:");
	String st=sc.nextLine();
	char[]ch=st.toCharArray();
	for(int i=0; i<ch.length; i++){
	    if(ch[i]>='A'&&ch[i]<='Z')
		ch[i]=(char)(ch[i]+32);}
	st=new String(ch);
	System.out.println(st);}

    public static void main(String[]args){
	printIntoLowerCase();}
}