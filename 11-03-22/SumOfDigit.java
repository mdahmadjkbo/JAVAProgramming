import java.util.Scanner;

class SumOfDigit{
    public static void printSumOfDigit(){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the String to calulate sum of its digits:");
	String st=sc.nextLine();
	int sum=0;
	for(int i=0; i<st.length(); i++){
	    char ch=st.charAt(i);
	    if(ch>='0'&&ch<='9') 
		sum+=(ch-48);}
	System.out.println("Sum of Digits: "+sum);}

    public static void main(String[]args){
	printSumOfDigit();}
}