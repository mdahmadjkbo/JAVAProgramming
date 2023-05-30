import java.util.Scanner;

class CharFreq{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the String to count the freq of each chars:");
	String st=sc.nextLine();
	int[]count=new int[128];
	    System.out.println("coun[]-length: "+count.length);
	for(int i=0; i<st.length(); i++){
	    char ch=st.charAt(i);
		//System.out.println(ch);
	    count[ch]++;}
		//System.out.println(count[ch]);
		//System.out.println(count[i]);}
	for(int i=0; i<count.length; i++){
	    if(count[i]!=0){
		System.out.println(i);
		System.out.println((char)i+"->"+count[i]);}
	}
    }
}