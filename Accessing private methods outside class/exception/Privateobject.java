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
  return this.privatestring;
 }
}
class Temp
{
 public static void main(String... w)throws Exception
 {
  Privateobject privateobject=new Privateobject("The private value");
  Object o[]={5,'c'};
  Class c[]={char.class,int.class};
  Method privatestringmethod=Privateobject.class.getDeclaredMethod("getprivatestring",c);
  privatestringmethod.setAccessible(true);
  String returnvalue=(String)privatestringmethod.invoke(privateobject,o);
  System.out.println("Return Value="+returnvalue);
 }
}

/* OUTPUT-
Exception in thread "main" java.lang.NoSuchMethodException: Privateobject.getprivatestring(char, int)
        at java.lang.Class.getDeclaredMethod(Unknown Source)
        at Temp.main(Privateobject.java:23)  */