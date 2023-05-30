import java.util.Scanner;

class Swap1stLastChar{

    public static void printSwipe(){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the String to Swipe 1st-char to Last-char:");
	String st=sc.nextLine();
	char[]ch=st.toCharArray();
	int t=0;
	for(int i=0; i<ch.length; i++){
	    if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
		t=i;
	    else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' '){
		char temp=ch[i];
		ch[i]=ch[t];
		ch[t]=temp;}
	st=new String(ch);}
	System.out.println(st);
    }

    public static void main(String[]args){
	printSwipe();}
}