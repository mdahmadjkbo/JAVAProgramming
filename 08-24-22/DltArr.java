//Method to Delete the Array
class DltArr{
int[]deleteArr(int ar[], int in){//ar-initial array, in-index
    if(in<0||in>ar.length){//possiblities of not getting the indices
	System.out.println("index not in the range");
    return ar;}
int[]rs=new int[ar.length-1];
for(int i=0; i<rs.length; i++){//i- index of old array
    if(i<in)
	rs[i]=ar[i];
    else
	rs[i]=ar[i+1];}
    }
}
//javac DltArr.java
//java DltArr