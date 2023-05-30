class SortArray{
    public static void main(String[]args){
	int[]ar=new int[args.length];
	for(int i=0; i<ar.length; i++)
	    ar[i]=Integer.parseInt(args[i]);
	int fsmall=ar[0], lsmall=ar[ar.length-1];
	int f=0, l=ar.length;
	while(f<=l){
	    
	for(int i=0; i<ar.length; i++){
	    int small=ar[0]; //big=ar[0];
	    if(ar[i]<=ar.length/2){
		if(ar[i]<small) small=ar[i];}
	    int big=ar[ar.length/2];
	    if(ar[i]>ar.length/2){
		if(ar[i]>big) big=ar[i];}
	}
	for(int i=0; i<ar.length; i++)
	    System.out.print(ar[i]+" ");}
}