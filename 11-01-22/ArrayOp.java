import java.util.Scanner;
class ArrayOp{
    public int[]readArray(){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the Array-size:");
	int n=sc.nextInt();
	int[]ra=new int[n];
	    System.out.println("enter the Array-Elements:");
	for(int i=0; i<ra.length; i++)
	    ra[i]=sc.nextInt();
    return ra;}

    public void dispArray(int[]ra){
	for(int i=0; i<ra.length; i++)
	    System.out.print(ra[i]+" ");
	System.out.println();}

    public int[]mergeZigZag(int[]a, int[]b){
	int[]c=new int[a.length+b.length];
	int i=0, j=0;
	while(i<a.length&&i<b.length){
	    c[j++]=a[i];
	    c[j++]=b[i++];}
	while(i<a.length)
	    c[j++]=a[i++];
	while(i<b.length)
	    c[j++]=b[i++];
    return c;}

    public int[]mergeSort(int[]a, int[]b){
	int[]c=new int[a.length+b.length];
	int i=0, j=0, k=0;
	while(i<a.length&&j<b.length){ 
	    if(a[i]<b[j])
		c[k++]=a[i++];
	    	//System.out.print("a[i]: "+c[k]);}
	    else
		c[k++]=b[j++];}
	    //System.out.print(c[k]);}
	while(i<a.length)
	    c[k++]=a[i++];
	    //System.out.print("a[ii]: "+c[k]);}
	while(j<b.length)
	    c[k++]=b[j++];
	    //System.out.print("b[jj]: "+c[k]);}
    return c;}

    public int[]insertEle(int[]ra, int ele, int in){
	if(in<0||in>ra.length){
	    System.out.println("index out of range!");
    return ra;}
	int[]rb=new int[ra.length+1];
	rb[in]=ele;
	for(int i=0; i<ra.length; i++){
	    if(i<in) rb[i]=ra[i];
	    else rb[i+1]=ra[i];}
    return rb;}

    public int[]delElement(int[]ra, int in){
	if(in<0||in>ra.length-1){
	    System.out.println("index out of range!");
    return ra;}
	int[]rb=new int[ra.length-1];
	for(int i=0; i<ra.length; i++){
	    if(i<=in) rb[i]=ra[i];
	    else rb[i-1]=ra[i];}
    return rb;}
}