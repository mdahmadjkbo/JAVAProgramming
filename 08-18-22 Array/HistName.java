import java.util.Scanner;
class HistName{
private static String hiLnthNm(String[]names){
    String hn=names[0];
    for(int i=1; i<names.length; i++){
	if(names[i].length()>hn.length())
	    hn=names[i];}
    return hn;}

public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no. of members:");
    int n=sc.nextInt();
    String names[]=new String[n];
    System.out.println("enter the "+n+" names:");
    for(int i=0; i<names.length; i++){
	names[i]=sc.next();
    String name=hiLnthNm(names);
    System.out.println("Highest length name is: "+name);}
    }
}	