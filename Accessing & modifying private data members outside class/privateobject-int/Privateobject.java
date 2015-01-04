import java.lang.reflect.*;
public class Privateobject
{
 private int privateint=0;                            
 public Privateobject(int privateint)                  
 {        
  this.privateint=privateint;
 }
}
class Temp
{
 public static void main(String... s)throws Exception
 {
  Privateobject privateobject=new Privateobject(5);
  Class c=Privateobject.class;
  Field privatefield=c.getDeclaredField("privateint");         
  privatefield.setAccessible(true);                 
  int fieldvalue=(int)privatefield.get(privateobject);
  System.out.println("Field value="+fieldvalue);

  //Code for modifying the value of private field-
  
  System.out.println("changed value of private field is : ");
  privatefield.set(privateobject,10);
  int fieldvalue1=(int)privatefield.get(privateobject);
  System.out.println("Field value="+fieldvalue1);
 }
}

/* OUTPUT-
Field value=5
changed value of private field is :
Field value=10  */