package polymorphism.org;

public class Student_Details {
	
	private void pandian(String name) {
		System.out.println("My name is " + name);
	}
	
	private void pandian(int a) {
        System.out.println("Age is " + a);
	}
	
	private void pandian(char g) {
       System.out.println("Gender " + g);
	}
	
	private void pandian(String add,int b) {
       System.out.println("Address is " + add + b);
	}
	
	private void pandian(float b) {
       System.out.println(b);
	}
	
	private void pandian(String f,char a) {
       System.out.println("Father name is " + f + a);
	}
	
	private void pandian(long acc) {
	   System.out.println(acc);
//       System.out.println(acc);
	}
	
	public static void main(String[] args) {
		Student_Details std = new Student_Details();
		
		std.pandian("Pandian");
		std.pandian(22);
		std.pandian('M');
		std.pandian("2/180 Middle street ",626205);
		std.pandian(4500f);
		std.pandian("Samy ", 'A');
		std.pandian(298472491247l);
	}
}
