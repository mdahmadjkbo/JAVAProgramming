import java.util.Scanner;
class Array{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the array:");
int size=sc.nextInt();
int[] ar=new int[size];
    System.out.println("enter "+size+" integer values.");
for(int i=0; i <ar.length; i++){
    ar[i]=sc.nextInt();}
System.out.println("user entered array elements:");
for(int i=0; i <ar.length; i++){
    System.out.print(ar[i]+" ");}
    }
}
//javac Array.java
//java Array