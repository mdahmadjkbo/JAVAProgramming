class Student{
    int id;
    String name;
    double per;

    Student(int id, String name, double per){
	this.id=id;
	this.name=name;
	this.per=per;}

    public String toString(){
	return "["+id+", "+name+", "+per+"%]";}

    public static void main(String[]args){
	int id=Integer.parseInt(args[0]);
	String name=args[1];
	double per=Double.parseDouble(args[2]);
	Student s=new Student(id, name, per);
	    System.out.println(s);}
}