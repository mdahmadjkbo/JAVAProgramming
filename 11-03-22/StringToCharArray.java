import java.util.Scanner;

class StringToCharArray{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the String to convert into Character-Array:");
	String st=sc.nextLine();
	char[]ch=st.toCharArray();
	for(int i=0; i<ch.length; i++)
	    System.out.println(i+"->"+ch[i]);}
}