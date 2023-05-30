class MainMatBig{
    public static void main(String[]args){
	Matrix m=new Matrix();
	int[][]mat=m.readMatrix();
	int bigMat=m.getBiggest(mat);
	    System.out.println("Biggest Element: "+bigMat);}
}