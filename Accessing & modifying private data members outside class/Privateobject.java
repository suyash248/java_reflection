import java.lang.reflect.*;
public class Privateobject
{
 private String privatestring=null;                            /* In this program one class is public so you have to save the .java file same as 
 public Privateobject(String privatestring)                   the name of the public class name (ie. 'Privateobject.java') because implicit 
 {                                                                                         compiling is done here.  */
  this.privatestring=privatestring;
 }
}
class Temp
{
 public static void main(String... s)throws Exception
 {
  Privateobject privateobject=new Privateobject("The private value");
  Class c=Privateobject.class;
  Field privatestringfield=c.getDeclaredField("privatestring");         /* If the field passed in the form of string in 'getDeclaredFeild()'
  privatestringfield.setAccessible(true);                                             method is not found then 'NoSuchFileFoundexception' occurs. */
  String fieldvalue=(String)privatestringfield.get(privateobject);
  System.out.println("Field value="+fieldvalue);
 }
}

/*OUTPUT-
Field value=The private value  */