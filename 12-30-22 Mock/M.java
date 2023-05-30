class N{
    public static void main(String[]args){
	int n=Integer.parseInt(args[0]);
	for(int i=1; i<=n; i++){
	    for(int j=1; j<=n; j++){
		if(j==1||(i==j&&i<=n/2+1)||(i+j==n+1&&i<=n/2+1)||j==n)
		    System.out.print("* ");
		else
		    System.out.print("  ");}
	    System.out.println();}
    }
}