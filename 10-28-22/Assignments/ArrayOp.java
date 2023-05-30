import java.util.Scanner;

class ArrayOp{

    public int[]readArray(){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter Array-size:");
	int n=sc.nextInt();
	int[]ar=new int[n];
	    System.out.println("enter "+n+" Array-elements:");
	for(int i=0; i<ar.length; i++)
	    ar[i]=sc.nextInt();
    return ar;}

    public void dispArray(int[]ar){
	for(int i=0; i<ar.length; i++)
	    System.out.print(ar[i]+" ");
	System.out.println();}

    public int[]mergeArray(int[]a, int[]b){
	int[]c=new int[a.length+b.length];
	for(int i=0; i<a.length; i++)
	    c[i]=a[i];
	for(int i=0; i<b.length; i++)
	    c[i+a.length]=b[i];
    return c;}

    public String highestName(String[]name){
	String hname=name[0];
	for(int i=1; i<name.length; i++){
	    if(name[i].length()>name[0].length())
		hname=name[i];}
    return hname;}
}