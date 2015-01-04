import java.lang.reflect.*;
import java.awt.*;
class Sampleinterface
{
	public static void printinterface(Object o)
	{
		Class c=o.getClass();
		Class inter[]=c.getInterfaces();
		for(int i=0;i<inter.length;i++)
		{
			System.out.println(inter[i].getName());
		}
	}
	public static void main(String... w)
	{
		T t1=new T();
		printinterface(t1);
	}
}
interface a1
{
}
interface a2
{
}
interface a3
{
}
class T implements a1,a2,a3
{
}

/*OUTPUT-
a1
a2
a3 */