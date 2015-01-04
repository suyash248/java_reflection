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
 public static void main(String... s)throws Exception
 {
  Privateobject privateobject=new Privateobject("The private value");
  Class c=Privateobject.class;
  Field privatestringfield=c.getDeclaredField("privatestring");         
  privatestringfield.setAccessible(true);                 
  String fieldvalue=(String)privatestringfield.get(privateobject);
  System.out.println("Field value="+fieldvalue);
 
  //Code for modifying the contents of private field-
  
  System.out.println("changed value of private field is : ");
  privatestringfield.set(privateobject,"changed value");
  String fieldvalue1=(String)privatestringfield.get(privateobject);
  System.out.println("Field value="+fieldvalue1);
 }
}

/*  OUTPUT-
Field value=The private value
changed value of private field is :
Field value=changed value  */