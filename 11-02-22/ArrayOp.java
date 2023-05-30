import java.util.Scanner;

class ArrayOp{

    public int[]readArray(){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the Array-size:");
	int n=sc.nextInt();
	int[]ra=new int[n];
	    System.out.println("enter the Array-elements:");
	for(int i=0; i<ra.length; i++)
	    ra[i]=sc.nextInt();
    return ra;}

    public void dispArray(int[]ra){
	for(int i=0; i<ra.length; i++)
	    System.out.print(ra[i]+" ");}

    public void printFreq(int[]ra){
	boolean[]rs=new boolean[ra.length];
	for(int i=0; i<ra.length; i++){
	    if(rs[i]==false){
		int count=1;
		for(int j=i+1; j<ra.length; j++){
		    if(ra[i]==ra[j]){
			count++;
			rs[j]=true;}
		}
	    System.out.println(ra[i]+"-->"+count);}
	}
    }
}