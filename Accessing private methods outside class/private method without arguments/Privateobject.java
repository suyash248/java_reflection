import java.lang.reflect.*;
class Privateobject
{
 private String privatestring=null;
 public Privateobject(String privatestring)
 {
  this.privatestring=privatestring;
 }
 private String getprivatestring()
 {
  return this.privatestring;
 }
}
class Temp
{
 public static void main(String... w)throws Exception
 {
  Privateobject privateobject=new Privateobject("The private value");
  Method privatestringmethod=Privateobject.class.getDeclaredMethod("getprivatestring",null);
  privatestringmethod.setAccessible(true);
  String returnvalue=(String)privatestringmethod.invoke(privateobject,null);
  System.out.println("Return Value="+returnvalue);
 }
}

/* OUTPUT-
Return Value=The private value  */