import java.lang.reflect.*;
public class Privateobject
{
 private String privatestring=null;
 public Privateobject(String privatestring)
 {
  this.privatestring=privatestring;
 }
}
class Temp
{
 public static void main(String... s)throws IOException
 {
  Privateobject privateobject=new Privateobject("The private value");
  Class c=Privateobject.class;
  Field privatestringfield=c.getDeclaredField("Private String");
  privatestringfield.setAccessible(true);
  String fieldvalue=(String)privatestringfield.get(privateobject);
  System.out.println("Field value="+fieldvalue);
 }
}