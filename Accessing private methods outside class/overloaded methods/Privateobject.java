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
 private String getprivatestring(int a1,char b1,String c1)
 {
  System.out.println("a1="+a1);
  System.out.println("b1="+b1);
  System.out.println("c1="+c1);
  System.out.println("This is getprivatestring");
  return this.privatestring;
 }
}
class Temp
{
 public static void main(String... w)throws Exception
 {
  Privateobject privateobject=new Privateobject("The private value");
  Object o[]={5,'c',"Hello"};
  Class c[]={int.class,char.class,String.class};
  Method privatestringmethod=Privateobject.class.getDeclaredMethod("getprivatestring",c);
  privatestringmethod.setAccessible(true);
  String returnvalue=(String)privatestringmethod.invoke(privateobject,o);
  System.out.println("Return Value="+returnvalue);
 }
}

/*  OUTPUT-
a1=5
b1=c
c1=Hello
This is getprivatestring
Return Value=The private value  */