import java.lang.reflect.*;
import java.io.*;
class Myjavap
{
 public static void main(String... w)throws Exception       
 {
  Class c=Class.forName(w[0]);
  FileOutputStream fout=new FileOutputStream(c.getSimpleName()+".txt");
  PrintStream ps=new PrintStream(fout);
  System.setOut(ps);
  System.out.println("Compiled from "+'"'+c.getSimpleName()+".java"+'"');
  Samp.printmodifiers(w[0]);
  Class inter[]=c.getInterfaces();
  System.out.print("class "+c.getName());
  if(inter.length!=0)
  {
   System.out.print(" implements ");
   for(int i=0;i<inter.length;i++)
   {
    System.out.print(inter[i].getName()+",");
   }
  }
  System.out.println("{");
  Sampleconstructor.printconstructor(w[0]);
  Samplefield.printfield(w[0]);
  Samplemethod.printmethod(w[0]);
  System.out.print("}");
 }
}
class Samp
{
 public static void printmodifiers(String s)
 {
  try
  {
   Class c=Class.forName(s);
   int m=c.getModifiers();
   if(Modifier.isPublic(m))
       System.out.print("public "); 
   if(Modifier.isAbstract(m))
       System.out.print("abstract ");
   if(Modifier.isFinal(m))
       System.out.print("final ");
  }catch(Exception e){System.out.println(e);}
 }
}
class Samplemethod
{
 public static void printmethod(String s)
 {
  try
  {
   Class c=Class.forName(s);
   Method ma[]=c.getDeclaredMethods();
   //Method ma[]=c.getMethods();
   for(int i=0;i<ma.length;i++)
   {
    System.out.print(" ");
    int m=ma[i].getModifiers();
    if(Modifier.isPublic(m))
       System.out.print("public "); 
    if(Modifier.isAbstract(m))
       System.out.print("abstract ");
    if(Modifier.isPrivate(m))
       System.out.print("private ");
    if(Modifier.isFinal(m))
       System.out.print("final ");
    if(Modifier.isProtected(m))
       System.out.print("protected ");
    if(Modifier.isSynchronized(m))
       System.out.print("synchronized ");
    if(Modifier.isNative(m))
       System.out.print("native ");
    if(Modifier.isStatic(m))
       System.out.print("static ");
    Class returntype=ma[i].getReturnType();
    if(returntype.isArray())
      System.out.print(returntype.getSimpleName());
    else
       System.out.print(returntype.getName());   
    System.out.print(" "+ma[i].getName());   
    System.out.print("(");
    Class type[]=ma[i].getParameterTypes();
    for(int k=0;k<type.length;k++)
    { 
     if(type[k].isArray())
       System.out.print(type[k].getSimpleName()+",");
     else
       System.out.print(type[k].getName()+",");
    }
    System.out.print(") ");
    Class ce[]=ma[i].getExceptionTypes();
    if(ce.length!=0)
    {
     System.out.print("throws ");
     for(int t=0;t<ce.length;t++)
     {
      String se=ce[t].getName();
      System.out.print(se+",");
     }
    }
    System.out.println(";");
   }
  }catch(Exception e){System.out.println(e);}
 }
}
class Sampleconstructor
{
 public static void printconstructor(String s)
 {
  try
  {
   Class c=Class.forName(s);
   Constructor cs[]=c.getDeclaredConstructors();
   for(int i=0;i<cs.length;i++)
   {
    System.out.print(" "+c.getName()+"(");
    Class type[]=cs[i].getParameterTypes();
    for(int k=0;k<type.length;k++)
    { 
     if(type[k].isArray())
       System.out.print(type[k].getSimpleName()+",");
     else
       System.out.print(type[k].getName()+",");
    }
    System.out.print(")");
    Class ce[]=cs[i].getExceptionTypes();
    if(ce.length!=0)
    {
     System.out.print("throws ");
     for(int t=0;t<ce.length;t++)
     {
      String se=ce[t].getName();
      System.out.print(se+",");
     }
    }
    System.out.println(";");
   }
  }catch(Exception e){System.out.println(e);}
 }
}
class Samplefield
{
 public static void printfield(String s)
 {
  try
  {
   Class c=Class.forName(s);
   Field f[]=c.getFields();        
   for(int j=0;j<f.length;j++)     
   {         
    System.out.print(" ");
    int m=f[j].getModifiers();
    if(Modifier.isPublic(m))
       System.out.print("public "); 
    if(Modifier.isProtected(m))
       System.out.print("protected ");
    if(Modifier.isPrivate(m))
       System.out.print("private ");
    if(Modifier.isAbstract(m))
       System.out.print("abstract ");
    if(Modifier.isFinal(m))
       System.out.print("final ");
    if(Modifier.isSynchronized(m))
       System.out.print("synchronized ");
    if(Modifier.isNative(m))
       System.out.print("native ");
    if(Modifier.isStatic(m))
       System.out.print("static ");
    Class type=f[j].getType();
    System.out.print(" "+type.getName());
    System.out.println(" "+f[j].getName()+";");
   }
  }catch(Exception e){System.out.println(e);}
 }
}