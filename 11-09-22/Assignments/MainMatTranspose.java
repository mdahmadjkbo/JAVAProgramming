class MainMatTranspose{
    public static void main(String[]args){
	Matrix m=new Matrix();
	int[][]mat=m.readMatrix();
	    System.out.println("Original-Matrix:");
	m.displayMatrix(mat);
	int[][]trans=m.getTranspose(mat);
	m.displayMatrix(trans);}
}