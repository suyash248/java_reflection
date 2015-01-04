import java.lang.reflect.*;
class Privateobject
{
 private static String getprivatestring(int a,char b,String s)
 {
  System.out.println("a="+a);
  System.out.println("b="+b);
  return s;
 }
}
class Temp
{
 public static void main(String... w)throws Exception
 {
  Privateobject privateobject=new Privateobject();
  Object o[]={5,'c',"Hello"};
  Class c[]={int.class,char.class,String.class};
  Method privatestringmethod=Privateobject.class.getDeclaredMethod("getprivatestring",c);
  privatestringmethod.setAccessible(true);
  String returnvalue=(String)privatestringmethod.invoke(null,o);
  System.out.println("Return Value="+returnvalue);
 }
}

/*  OUTPUT-
a=5
b=c
Return Value=Hello  */