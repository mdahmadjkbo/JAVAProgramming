import java.util.Scanner;

class Consonents{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the String to count Consonents present:");
	String st=sc.nextLine();
	int cCount=0;
	for(int i=0; i<st.length(); i++){
	    char ch=st.charAt(i);
	    if(ch>'A'&&ch<='Z'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U') cCount++;
	    else if(ch>'a'&&ch<='z'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u') cCount++;}
	System.out.println("Consonent-Counts: "+cCount);}
}