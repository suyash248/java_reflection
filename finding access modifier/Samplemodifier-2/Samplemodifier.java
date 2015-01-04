import java.lang.reflect.*;
import java.awt.*;
import java.io.*;
class Samplemodifier
{
 public static void printmodifiers(Object o)throws Exception
 {
  Class c=o.getClass();
  int m=c.getModifiers();
  if(Modifier.isPublic(m))
       System.out.println("public"); 
 if(Modifier.isAbstract(m))
       System.out.println("abstract");
 if(Modifier.isFinal(m))
       System.out.println("final");
 }
 public static void main(String... w)throws Exception
 {
  String a=new String("aa");
  printmodifiers(a);
 }
}

/* OUTPUT-
public
final  */