class Sum{
    public static void main(String[]add){
	int sum=0;
	for(int i=0; i<add.length; i++)
	    sum+=Integer.parseInt(add[i]);
	System.out.println("Summation: "+sum);}
}