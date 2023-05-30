class MainMatSmall{
    public static void main(String[]args){
	Matrix m=new Matrix();
	int[][]mat=m.readMatrix();
	int smallMat=m.getSmallest(mat);
	    System.out.println("Smallest Element: "+smallMat);}
}