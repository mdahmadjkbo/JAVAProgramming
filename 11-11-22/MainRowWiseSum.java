class MainRowWiseSum{
    public static void main(String[]args){
	Matrix m=new Matrix();
	int[][]mat=m.readMatrix();
	    System.out.println("Original Matrix: ");
	m.dispMatrix(mat);
	    System.out.println("Sum of the Matrix: ");
	m.rowWiseSum(mat);}
}