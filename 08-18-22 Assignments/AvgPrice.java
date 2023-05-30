import java.util.Scanner;
class AvgPrice{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the Array.");
int size=sc.nextInt();
double[]pr=new double[size];
    System.out.println("enter "+size+" prices.");
for(int i=0; i <pr.length; i++){
    pr[i]=sc.nextDouble();}
System.out.println("the user entered Prices are:");
for(int i=0; i <pr.length; i++){
    System.out.println(pr[i]+" ");}
for(int i=0; i <pr.length; i++){
double sum=sum+pr[i];}
    }
}
//javac AvgPrice.java
//java AvgPrice