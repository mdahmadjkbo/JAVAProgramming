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

    public void repSumArr(int[]ra){
	for(int i=0; i<ra.length; i++){
	    int sum=0, num=ra[i];
	    while(num!=0){
		sum+=num%10;
		num/=10;}
	ra[i]=sum;}
    }

    public void revArray(int[]ra){
	int i=0, j=ra.length-1;
	while(i<j){
	    int temp=ra[i];
	    ra[i]=ra[j];
	    ra[j]=temp;
	    i++;
	    j--;}
    }
}