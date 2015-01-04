import java.lang.reflect.*;
import java.awt.*;
import java.io.*;
class Samp
{
 public static void printmodifiers(String s)
 {
  try
  {
   Class c=Class.forName(s);
   int m=c.getModifiers();
   if(Modifier.isPublic(m))
       System.out.println("public"); 
   if(Modifier.isAbstract(m))
       System.out.println("abstract");
   if(Modifier.isFinal(m))
       System.out.println("final");
  }catch(Exception e){System.out.println(e);}
 }
 public static void main(String... w)throws Exception
 {
  System.out.println("Enter the class name with full package");
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String s=br.readLine();
  System.out.println();
  System.out.println("Modifiers of class "+s+" are : ");
  printmodifiers(s);
 }
}


/*  OUTPUT-
Enter the class name with full package
java.awt.Graphics

Modifiers of class java.awt.Graphics are :
public
abstract  */


//Note-Here "ClassNotFoundException" may occur.

/*  OUTPUT-
Enter the class name with full package
sfs

Modifiers of class sfs are :
java.lang.ClassNotFoundException: sfs  */
