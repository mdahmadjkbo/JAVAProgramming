class MainMatSumOfEle{
    public static void main(String[]args){
	Matrix m=new Matrix();
	int[][]mat=m.readMatrix();
	m.displayMatrix(mat);
	int sum=m.getSumOfEle(mat);
	    System.out.println(sum);}
}