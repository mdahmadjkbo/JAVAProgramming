import java.util.Scanner;

class CountWord{

    public static void printWordCount(){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the String to count no. of words presnt: ");
	String st=sc.nextLine();
	char[]ch=st.toCharArray();
	int count=0;
	for(int i=0; i<ch.length; i++){
	    if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
		count++;}
	System.out.println("Toltal word-count in String: "+count);}

    public static void main(String[]args){
	printWordCount();}
}