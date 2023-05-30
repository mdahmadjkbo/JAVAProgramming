//Method defined to insert an Array inside another Array from the Specified index
class InsertArray{
int[]insrtArr(int ar[]; int[]br; int in){
    if(in<0||in>ar.length){
	System.out.println("index not in the range");
    return ar;}

int[]rs=new int[ar.length+br.length];//ar-1st Array, br-2nd Array
for(int i=0; i<br.length; i++){
    rs[in+i]=br[i];}

for(int i=0; i<ar.length; i++){
    if(i<in)
	rs[i]=ar[i];
    else
	rs[i+br.length]=a[i];}
    return rs;}
}
//javac InsertArray.java
//java InsertArray
    