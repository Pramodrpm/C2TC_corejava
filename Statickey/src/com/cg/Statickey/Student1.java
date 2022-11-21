package com.cg.Statickey;

class Student1 {
	int rollno;
	String name;
	static String college;
	static {
		 college ="SIET";
	}
	Student1(int r, String n){
		rollno=r;
		name=n;
		}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
		
	}
static void change() {
	college="AIT";
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1(111,"Pramod");
		Student1 s2=new Student1(121,"Ramanna");
		change();
		s1.display();
		s2.display();
		
	}

}
