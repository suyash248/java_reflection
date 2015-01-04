import java.lang.reflect.*;
//import java.awt.*;
class Samplename
{
 /*public static void printname(Object o)
 {
  Class c=o.getClass();
  System.out.println(c.getName());
 }*/
 public static void printname(String s)
 {
  try
  {
   Class c=Class.forName(s);
   System.out.println(c.getName());
   //StringBuffer sb=(StringBuffer)c.newInstance();          // remove comment
   Temp sb=(Temp)c.newInstance();                             // make it comment
   sb.show();                                                                      // make it comment
   //System.out.println(sb.length());                                   // remove comment                        
   //System.out.println(sb.capacity());                               // remove comment
  }catch(Exception e){System.out.println(e);}
 }
 public static void main(String s[])
 {
  //Button b=new Button("hh");
  //printname("java.lang.StringBuffer");                        // remove comment
  printname("Temp");                                                 // make it comment
  Class c=java.lang.Thread.class;
  System.out.println(c.getName());               
 }
}
class Temp
{
 Temp()                                                                            // newIstance() makes the object by using default constructor ie. when newInstance() is invoked                                                                                                      
 {                                                                                        //   default constructor of that class excecutes.if default constructot is not present in a class then the
  System.out.println("Default constructor");                //   object of that class can not be created via newIstance()
 }                                                                                          
 void show()
 {
  System.out.println("Creation of object via reflection");
 }
}