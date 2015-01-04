import java.lang.reflect.*;
import java.awt.*;
class Samplename
{
 public static void printname(Object o)
 {
  Class c=o.getClass();
  System.out.println(c.getName());
 }             
 public static void main(String s[])
 {
  Button b=new Button("hh");           
  printname(b);                                               
 }
}

/* OUTPUT-
    java.awt.Button */