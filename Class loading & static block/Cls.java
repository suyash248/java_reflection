class Cls
{
 public static void main(String... w)
 {
  try{
  Class c=Class.forName("Temp");
  System.out.println("This is Cls");
  }catch(Exception e){System.out.println(e);}
 }
}

/*  OUTPUT-
static block
This is Cls  

First,you have to compile 'Temp.java' as well as 'Cls.java' both.If you will not compile 'Temp.java' and try to run 'Cls.java' 
then 'java.lang.ClassNotFoundException: Temp' will occur.  */
