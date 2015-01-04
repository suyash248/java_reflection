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
  return this.privatestring;                                       // 'this' is optional.
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
Return Value=The private value  */