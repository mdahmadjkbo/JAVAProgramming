class Merge2Array{
    public static void main(String[]args){
	ArrayOp ao=new ArrayOp();
	int[]a=ao.readArray();
	int[]b=ao.readArray();
	int[]c=ao.mergeArray(a, b);
	    System.out.println("Merged Array-elements:");
	ao.dispArray(c);}
}