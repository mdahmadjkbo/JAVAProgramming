class MainPrime{
    public static void main(String[]args){
	Matrix m=new Matrix();
	int[][]mat=m.readMatrix();
	m.displayMatrix(mat);
	    System.out.println("Total counts of Prime-elements present in the Matrix: "+m.prime(mat));}
}