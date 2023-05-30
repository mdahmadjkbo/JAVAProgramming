class MainZigZag{
    public static void main(String[]args){
	ArrayOp ao=new ArrayOp();
	int[]a=ao.readArray();
	int[]b=ao.readArray();
	int[]c=ao.mergeZigZag(a, b);
	    System.out.println("Merged-Array:");
	ao.dispArray(c);}
}