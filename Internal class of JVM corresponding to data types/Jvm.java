class Jvm
{
 public static void main(String... w)
 {
  Class c1=int.class;
  System.out.println("c1 represents the object of class : "+c1.getName());
  Class c2=float.class;
  System.out.println("c2 represents the object of class : "+c2.getName());
  Class c3=char.class;
  System.out.println("c3 represents the object of class : "+c3.getName());
  Class c4=double.class;
  System.out.println("c4 represents the object of class : "+c4.getName());
  Class c5=byte.class;
  System.out.println("c5 represents the object of class : "+c5.getName());
  Class c6=long.class;
  System.out.println("c6 represents the object of class : "+c6.getName());
  Class c7=short.class;
  System.out.println("c7 represents the object of class : "+c7.getName());
  Class c8=boolean.class;
  System.out.println("c8 represents the object of class : "+c8.getName());
 }
}

/* OUTPUT-
c1 represents the object of class : int
c2 represents the object of class : float
c3 represents the object of class : char
c4 represents the object of class : double
c5 represents the object of class : byte
c6 represents the object of class : long
c7 represents the object of class : short
c8 represents the object of class : boolean

REMARK-
Every data type in java is internal object. ie. every data type in java is represented via object of
some class(Internal class of JVM which is not present in 'rt.jar'.)  */