import java.lang.reflect.*;
import java.io.*;
class Sampleinterface
{
	public static void printinterface(String s)throws Exception
	{
		Class c=Class.forName(s);
		Class inter[]=c.getInterfaces();
		for(int i=0;i<inter.length;i++)
		{
			System.out.println(inter[i].getName());
		}
	}
	public static void main(String... w)
	{
		try
 		 {
 		  System.out.println("Enter the class name with full package");
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 		  String s=br.readLine();
 		  System.out.println("Interfaces of "+s+" are : ");
 		  printinterface(s);
 		 }catch(Exception e){System.out.println(e);}
	}
}


/* OUTPUT-
Enter the class name with full package
java.lang.Class
Interfaces of java.lang.Class are :
java.io.Serializable
java.lang.reflect.GenericDeclaration
java.lang.reflect.Type
java.lang.reflect.AnnotatedElement  */