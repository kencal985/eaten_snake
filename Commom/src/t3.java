
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
			System.out.println("ѧУ"+t3.this.name);
			System.out.println("����"+this.name);
			System.out.println("����"+this.age);
		}
	}
	public void output()
	{
		Student stu=new Student("����ѧԺ","����",24);
		stu.output();
	}
	
  public static void main(String []args)
  {
	 System.out.println("ͨ���ⲿ���Ա����");
	 t3 a=new t3();
	 a.output();
	 System.out.println("ֱ�ӷ����ڲ���");
	 t3.Student b=a.new Student("����ѧԺ", "����", 23);
	 b.output();
	 
	  
  }
}
