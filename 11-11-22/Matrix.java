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

    public void dispMatrix(int[][]mat){
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

    public int[][]rowWiseReverse(int[][]mat){
	for(int i=0; i<mat.length; i++){
	    int f=0, l=mat[i].length-1;
	while(f<l){
	    int temp=mat[i][f];
	    mat[i][f]=mat[i][l];
	    mat[i][l]=temp;
	    f++;
	    l--;}
	}
    return mat;}

    public int[][]colWiseReverse(int[][]mat){
	for(int j=0; j<mat[0].length; j++){
	    int f=0, l=mat.length-1;
	    while(f<l){
		int temp=mat[f][j];
		mat[f][j]=mat[l][j];
		mat[l][j]=temp;
		f++;
		l--;}
	}
    return mat;}

    public void rowWiseSum(int[][]mat){
	int[]sum=new int[mat.length];
	for(int i=0; i<mat.length; i++){
	    for(int j=0; j<mat[i].length; j++)
		sum[i]+=mat[i][j];
	    System.out.println(sum[i]);}
    }

    public void colWiseSum(int[][]mat){
	System.out.println("Sum of elements column-wise:");
	int[]sum=new int[mat[0].length];
	for(int j=0; j<mat[0].length; j++){
	    for(int i=0; i<mat.length; i++)
		sum[j]+=mat[i][j];
	    System.out.print(sum[j]+" ");}
    }
}