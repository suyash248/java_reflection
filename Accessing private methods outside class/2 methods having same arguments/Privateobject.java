import java.lang.reflect.*;
class Privateobject
{
 private String privatestring=null;
 public Privateobject(String privatestring)
 {
  this.privatestring=privatestring;
 }
 private String getprivatestring(int a,char b)
 {
  System.out.println("a="+a);
  System.out.println("b="+b);
  System.out.println("This is getprivatestring");
  return this.privatestring;
 }
 private String getprivatestring1(int a1,char b1)
 {
  System.out.println("a1="+a1);
  System.out.println("b1="+b1);
  System.out.println("This is getprivatestring1");
  return this.privatestring;
 }
}
class Temp
{
 public static void main(String... w)throws Exception
 {
  Privateobject privateobject=new Privateobject("The private value");
  Object o[]={5,'c'};
  Class c[]={int.class,char.class};
  Method privatestringmethod=Privateobject.class.getDeclaredMethod("getprivatestring",c);
  privatestringmethod.setAccessible(true);
  String returnvalue=(String)privatestringmethod.invoke(privateobject,o);
  System.out.println("Return Value="+returnvalue);
 }
}

/*  OUTPUT-
a=5
b=c
This is getprivatestring
Return Value=The private value  */