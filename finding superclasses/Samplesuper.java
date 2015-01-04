import java.lang.reflect.*;
import java.io.*;
class Samplesuper
{
 public static void printsuperclass(String s)throws Exception
 {
  Class subclass=Class.forName(s);
  Class superclass=subclass.getSuperclass();
  while(superclass!=null)
  {
   System.out.println(superclass.getName());
   subclass=superclass;
   superclass=subclass.getSuperclass();
  }
 }
 public static void main(String w[])
 {
  try
  {
   System.out.println("Enter the class name with full package");
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String s=br.readLine();
   System.out.println("Superclasses of "+s+" are : ");
   printsuperclass(s);
  }catch(Exception e){System.out.println(e);}
 }
}

/* OUTPUT-
     Enter the class name with full package
java.awt.Frame
Superclasses of java.awt.Frame are :
java.awt.Window
java.awt.Container
java.awt.Component
java.lang.Object  */