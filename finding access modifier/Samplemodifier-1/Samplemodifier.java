import java.lang.reflect.*;
import java.awt.*;
import java.io.*;
class Samplemodifier
{
 public static void printmodifiers(String s)throws Exception
 {
  Class c=Class.forName(s);
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
  printmodifiers("java.awt.Graphics");
 }
}

/* OUTPUT-
public
abstract  */