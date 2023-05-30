import java.util.Scanner;

class Mat3{
    public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the order of the Matrix:");
	int r=sc.nextInt();
	int c=sc.nextInt();
	int[][]mat=new int[r][c];

	System.out.println("Enter the elements:"); 
	for(int i=0; i<mat.length; i++){
	    for(int j=0; j<mat[i].length; j++)
		//System.out.print(mat[i][j]+" ");
		mat[i][j]=sc.nextInt();
	    System.out.println();}

	System.out.println("Entered elements:");
	for(int i=0; i<mat.length; i++){
	System.out.println("Row no: "+i);
	    for(int j=0; j<mat[i].length; j++){
		//System.out.print(mat[i][j]+" ");
		//mat[i][j]=sc.nextInt();
		System.out.print(mat[i][j]+" ");}
	//System.out.println();
	System.out.println();
	System.out.println("Row no: "+i);
	System.out.println();}

	System.out.println("Matrix length: "+mat.length);
	System.out.println("1st-row length: "+mat[0].length);
	System.out.println("2nd-row length: "+mat[1].length);
	System.out.println("3rd-row length: "+mat[2].length);}
}