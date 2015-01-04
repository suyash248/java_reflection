import java.awt.*;
import java.lang.reflect.*;
import java.io.*;
import java.net.*;
class Samplepackage
{
 public static void printpackage(Object o)
 {
  Class c=o.getClass();
  Package p=c.getPackage();
  System.out.println(p.getName());
 }
 public static void main(String s[])throws IOException
 {
  ServerSocket t=new ServerSocket();              /* This program tell that the name of the
  printpackage(t);                                                 package in which "ServerSocket" class is present.  */
 }
}

/*OUTPUT-
java.net  */