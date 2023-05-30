import java.util.Scanner;

class Matrix{

    public int[][]readMatrix(){
	Scanner sc=new Scanner(System.in);
	    System.out.println("enter the order of the Matrix:");
	int r=sc.nextInt();
	int c=sc.nextInt();
	int[][]mat=new int[r][c];
	    System.out.println("enter "+r*c+" values row-wise: ");
	for(int i=0; i<mat.length; i++){
	    for(int j=0; j<mat[i].length; j++)
		mat[i][j]=sc.nextInt();}
    return mat;}

    public void displayMatrix(int[][]mat){
	for(int i=0; i<mat.length; i++){
	    for(int j=0; j<mat[i].length; j++)
		System.out.print(mat[i][j]+" ");
	System.out.println();}
    }

    public int getBiggest(int[][]mat){
	int big=mat[0][0];
	for(int i=0; i<mat.length; i++){
	    for(int j=0; j<mat[i].length; j++)
		if(mat[i][j]>big) big=mat[i][j];}
    return big;}

    public int getSmallest(int[][]mat){
	int small=mat[0][0];
	for(int i=0; i<mat.length; i++){
	    for(int j=0; j<mat[i].length; j++)
		if(mat[i][j]<small) small=mat[i][j];}
    return small;}

    public int getSumOfEle(int[][]mat){
	int sum=0;
	for(int i=0; i<mat.length; i++){
	    for(int j=0; j<mat[i].length; j++)
	sum+=mat[i][j];}
    return sum;}

    //public int[][]getTranspose(int[][]mat){
	//int[][]trans=new int[mat.length][];
	    //System.out.println("Transpose-Matrix: ");
	//for(int i=0; i<trans.length; i++){
	    //for(int j=0; j<trans[i].length; j++)
		//trans=mat[i][j];}
    //return trans;}
}