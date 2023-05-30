//1. Sum of Non-Strong within n
//2. Anagram
//3. M-Pattern
//4. Sort Array till half-Ascending, remaining half-Descending
//5. Consonent-counts

class SumOfNonStrong{
    public static void main(String[]args){//123
	int n=Integer.parseInt(args[0]);
	int count=0, sum=0;
	    System.out.println("Non-Strong nos. within "+n+": ");
	for(int i=1; i<=n; i++){
	    boolean strong=isStrong(i);
	    if(strong!=true){
		count++;
		sum+=i;
		    System.out.print(i+" ");}
	}
	System.out.println();
	System.out.println("Count of Non-Strong nos: "+count);
	System.out.println("Sum of all the Non-Strong nos within "+n+": "+sum);}

    public static boolean isStrong(int i){
	int sum=0, temp=i;
	while(i!=0){
	    sum+=getFact(i%10);
	    i/=10;}
    return temp==sum;}

    public static int getFact(int r){
	int mul=1;
	while(r!=0){
	    mul*=r;
	    r--;}
    return mul;}
}
	