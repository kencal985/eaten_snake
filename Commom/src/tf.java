import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
interface p
{
	abstract void k();
	static void show()
	{
		
	}
}
class c
{
	static int g=12;
	
	double area()
	{
		final int g=12;
		int c=0;
		return c; 
	}
	
	
}
class a extends c
{
	int o=c.g;
	void sho()
	{
		System.out.println(g+c.g);
	}
}
public class tf {
  public static void display(int x,int...arg)
  {
	  System.out.print(x+" ");
	  for(int i=0;i<arg.length;i++)
	  {
		  System.out.print(arg[i]+" ");
		  System.out.println("\n");
	  }
	  
  }
  public static void main(String[] args)
  {
	  /*display(5);
	  display(5,5,88);
	  final int g;
	  int aa[];
	  int [] MyArray = new int [10]; */
	  int month=65;
	  int days;
	  switch(month)
	  {
	  case 1:days=1;
	  case 6:days=6;
	  case 7:days=7;
	  case 8:days=8;
	  break;
	  case 12:days=12;
	  default: days=98;
	  }
		System.out.println(days);	  
  }
}
