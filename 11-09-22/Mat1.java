class Mat1{
    public static void main(String[]args){
	int[]a={22, 23, 24};
	int[]b={32, 33, 34, 35};
	int[]c={42, 43};

	int[][]mat={a, b, c};
	    System.out.println("Matrix-length: "+mat.length);
	    System.out.println("a[]-length: "+a.length);
	    System.out.println(mat[1].length);
	for(int i=0; i<mat.length; i++){
	    for(int j=0; j<mat[i].length; j++)
		System.out.print(mat[i][j]+" ");
	    System.out.println();}
	}
}