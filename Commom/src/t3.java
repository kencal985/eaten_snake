
public class t3 {
	String name;
	public class Student
	{
		int age;
		String name;
		public Student(String schoolname,String studentName,int newAge)
		{
			t3.this.name=schoolname;
			name=studentName;
			age=newAge;
			
		}
		public void output()
		{
			System.out.println("学校"+t3.this.name);
			System.out.println("姓名"+this.name);
			System.out.println("年龄"+this.age);
		}
	}
	public void output()
	{
		Student stu=new Student("金融学院","张三",24);
		stu.output();
	}
	
  public static void main(String []args)
  {
	 System.out.println("通过外部类成员访问");
	 t3 a=new t3();
	 a.output();
	 System.out.println("直接访问内部类");
	 t3.Student b=a.new Student("金融学院", "李四", 23);
	 b.output();
	 
	  
  }
}
