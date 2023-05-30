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

    public int prime(int[][]mat){
	System.out.print("Prime-elements: ");
	int count=0, sum=0;
	for(int i=0; i<mat.length; i++){
	    for(int j=0; j<mat[i].length; j++){
		for(int d=2; d<=(mat[i][j])/2; d++){
		    if(mat[i][j]%d==0){
			count++;
			System.out.print(mat[i][j]+" ");
			sum+=mat[i][j];
			break;}
		}
	    }
	}
	System.out.println();
	System.out.println("Sum of Prime-elements: "+sum);
    return count;}

    public int[][]getTranspose(int[][]mat){
	int[][]trans=new int[mat[0].length][mat.length];
	    System.out.println("Transpose-Matrix:");
	for(int i=0; i<mat.length; i++){
	    for(int j=0; j<mat[i].length; j++)
		trans[j][i]=mat[i][j];}
    return trans;}
}