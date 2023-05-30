class MainRowWiseRev{
    public static void main(String[]args){
	Matrix m=new Matrix();
	int[][]mat=m.readMatrix();
	System.out.println("Original Matrix: ");
	m.dispMatrix(mat);
	int[][]rev=m.rowWiseReverse(mat);
	m.dispMatrix(rev);}
}