import java.util.Scanner;

class ReverseSentence{

    public static void printReverse(){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the String to Reverse:");
	String st=sc.nextLine();
	char[]ch=st.toCharArray();
	//for(int i=0; i<ch.length; i++){
	int f=0, l=ch.length-1;
	    while(f<l){
		char temp=ch[f];
		ch[f]=ch[l];
		ch[l]=temp;
		f++;
		l--;}
	st=new String(ch);
	System.out.println("Reversed-String:");
	System.out.println(st);}

    public static void main(String[]args){
	printReverse();}
}