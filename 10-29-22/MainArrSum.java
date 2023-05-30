class MainArrSum{
    public static void main(String[]args){
	ArrayOp ao=new ArrayOp();
	int[]ra=ao.readArray();
	    System.out.println("Array before:");
	ao.dispArray(ra);
	ao.repSumArr(ra);
	    System.out.println("The Replaced-Array:");
	ao.dispArray(ra);}
}
