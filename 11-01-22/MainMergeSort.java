class MainMergeSort{
    public static void main(String[]args){
	ArrayOp ao=new ArrayOp();
	int[]a=ao.readArray();
	int[]b=ao.readArray();
	int[]c=ao.mergeSort(a, b);
	    System.out.println("2 Sorted-Merged-Arrays in Ascending-order:");
	ao.dispArray(c);}
}