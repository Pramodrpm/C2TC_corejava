package accessmodifier;
public class test1 {
public int i=10;
public void show() {
	System.out.println("hello world");
}
public class main {

	public static void  main(String[] args) {
		test1 t1=new test1();
		t1.show();
		System.out.println(t1.i);

	}

}
}
