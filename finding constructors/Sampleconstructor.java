import java.lang.reflect.*;
import java.awt.*;
import java.io.*;
class Sampleconstructor
{
 public static void printconstructor(String s)
 {
  try
  {
   Class c=Class.forName(s);
   Constructor cs[]=c.getConstructors();
   for(int i=0;i<cs.length;i++)
   {
    System.out.print(c.getName()+"(");
    Class type[]=cs[i].getParameterTypes();
    for(int k=0;k<type.length;k++)
    {
     System.out.print(type[k].getName()+",");
    }
    System.out.print(")");
    System.out.println(" ");
   }
  }catch(Exception e){System.out.println(e);}
 } 
 public static void main(String... w)
 {
  try
  {
   System.out.println("Enter the class name with full package");
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String s=br.readLine();
   System.out.println("Constructors of class "+s+" are : ");
   printconstructor(s);
  }catch(Exception e){System.out.println(e);}
 }
}

/* OUTPUT-
Enter the class name with full package
java.lang.Thread
Constructors of class java.lang.Thread are :
java.lang.Thread(java.lang.String,)
java.lang.Thread(java.lang.ThreadGroup,java.lang.Runnable,)
java.lang.Thread(java.lang.Runnable,)
java.lang.Thread()
java.lang.Thread(java.lang.ThreadGroup,java.lang.Runnable,java.lang.String,long,)
java.lang.Thread(java.lang.ThreadGroup,java.lang.Runnable,java.lang.String,)
java.lang.Thread(java.lang.Runnable,java.lang.String,)
java.lang.Thread(java.lang.ThreadGroup,java.lang.String,)
 */



//NOTE-
/* If there are 'n' constructors in a class then 'n' objects of "Constructor" class will be created and are 
     stored in the array of length=n.Each object of "Constructor" class will represent one constructor of
      that class. "Constructor" class is found in 'java.lang.reflect' package and 'getConstructors()' is a 
      method of "Class" class.  */