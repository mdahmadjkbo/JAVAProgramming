class MainReverse{
    public static void main(String[]args){
	ArrayOp ao=new ArrayOp();
	int[]ar=ao.readArray();
	ao.dispArray(ar);
	ao.revArray(ar);
	    System.out.println("after reverse:");
	ao.dispArray(ar);}
}