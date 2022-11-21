package com.cg.Statickey;

class Student {
	int rollno;
	String name;
	static String college ="SIET";
	Student(int r, String n){
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
		Student s1=new Student(111,"rakshith");
		Student s2=new Student(121,"Ram");
		change();
		s1.display();
		s2.display();
		
	}

}
