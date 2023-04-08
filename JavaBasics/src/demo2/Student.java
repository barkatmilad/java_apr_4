package demo2;

public class Student {
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name= name;
		}
		public void Student() {
			System.out.println(id + name);
	}
		public static void main(String[] args) {
			Student student1 = new Student(1," John");
			Student student2 = new Student(2," Sam");
			student1.Student();
			student2.Student();
			
	}

}
