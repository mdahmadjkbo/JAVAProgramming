class MainColWiseReverse{
    public static void main(String[]args){
	Matrix m=new Matrix();
	int[][]mat=m.readMatrix();
	    System.out.println("Original Matrix: ");
	m.dispMatrix(mat);
	int[][]rev=m.colWiseReverse(mat);
	    System.out.println("Reversed Matrix: ");
	m.dispMatrix(rev);}
}