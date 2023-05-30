class CountFreq{
    public static void main(String[]args){
	int[]ra={23, 45, 56, 45, 58, 45, 58, 25};
	int big=ra[0];
	for(int i=1; i<ra.length; i++){
	    if(big>ra[i]) big=ra[i];}
	int[]count=new int[big+1];
	for(int i=0; i<ra.length; i++){
	    count[ra[i]]++;}
	for(int i=0; i<count.length; i++){
	    if(count[i]!=0)
		System.out.println(i+"->"+count[i]);}
    }
}