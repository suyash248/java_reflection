import java.lang.reflect.*;
import java.io.*;
class Samplemethod
{
 public static void printmethod(String s)
 {
  try
  {
   Class c=Class.forName(s);
   Method ma[]=c.getMethods();
   for(int i=0;i<ma.length;i++)
   {
    int m=ma[i].getModifiers();
    if(Modifier.isPublic(m))
       System.out.print("public "); 
    if(Modifier.isAbstract(m))
       System.out.print("abstractb");
    if(Modifier.isFinal(m))
       System.out.print("final ");
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
    System.out.print(returntype.getName());   
    System.out.print(" "+ma[i].getName());   
    System.out.print("(");
    Class type[]=ma[i].getParameterTypes();
    for(int k=0;k<type.length;k++)
    { 
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
    System.out.println(" ");
   }
  }catch(Exception e){System.out.println(e);}
 }
 public static void main(String... w)
 {
  try
  {
   System.out.println("Enter the class name with full package");
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String s=br.readLine();
   System.out.println("Methods of class "+s+" are : ");
   printmethod(s);
  }catch(Exception e){System.out.println(e);}
 }
}

/*  OUTPUT- 

Enter the class name with full package
java.lang.Class
Methods of class java.lang.Class are :
public static java.lang.Class forName(java.lang.String,boolean,java.lang.ClassLoader,) throws java.lang.ClassNotFoundException,
public static java.lang.Class forName(java.lang.String,) throws java.lang.ClassNotFoundException,
public native boolean isAssignableFrom(java.lang.Class,)
public native java.lang.Class getSuperclass()
public java.lang.String toString()
public native boolean isInstance(java.lang.Object,)
public native int getModifiers()
public native boolean isInterface()
public native boolean isArray()
public native boolean isPrimitive()
public native java.lang.Class getComponentType()
public java.lang.String getName()
public java.lang.Class asSubclass(java.lang.Class,)
public java.lang.Object cast(java.lang.Object,)
public [Ljava.lang.Class; getClasses()
public java.lang.reflect.Field getField(java.lang.String,) throws java.lang.NoSuchFieldException,java.lang.SecurityException,
public [Ljava.lang.reflect.Field; getFields() throws java.lang.SecurityException,
public java.lang.reflect.Method getMethod(java.lang.String,[Ljava.lang.Class;,) throws java.lang.NoSuchMethodException,java.lang.SecurityException,
public [Ljava.lang.reflect.Method; getMethods() throws java.lang.SecurityException,
public java.lang.Package getPackage()
public java.net.URL getResource(java.lang.String,)
public native [Ljava.lang.Object; getSigners()
public boolean isAnnotation()
public boolean isEnum()
public boolean isLocalClass()
public boolean isSynthetic()
public java.lang.Object newInstance() throws java.lang.InstantiationException,java.lang.IllegalAccessException,
public boolean desiredAssertionStatus()
public java.lang.annotation.Annotation getAnnotation(java.lang.Class,)
public [Ljava.lang.annotation.Annotation; getAnnotations()
public java.lang.String getCanonicalName()
public java.lang.ClassLoader getClassLoader()
public java.lang.reflect.Constructor getConstructor([Ljava.lang.Class;,) throws java.lang.NoSuchMethodException,java.lang.SecurityException,
public [Ljava.lang.reflect.Constructor; getConstructors() throws java.lang.SecurityException,
public [Ljava.lang.annotation.Annotation; getDeclaredAnnotations()
public [Ljava.lang.Class; getDeclaredClasses() throws java.lang.SecurityException,
public java.lang.reflect.Constructor getDeclaredConstructor([Ljava.lang.Class;,) throws java.lang.NoSuchMethodException,java.lang.SecurityException,
public [Ljava.lang.reflect.Constructor; getDeclaredConstructors() throws java.lang.SecurityException,
public java.lang.reflect.Field getDeclaredField(java.lang.String,) throws java.lang.NoSuchFieldException,java.lang.SecurityException,
public [Ljava.lang.reflect.Field; getDeclaredFields() throws java.lang.SecurityException,
public java.lang.reflect.Method getDeclaredMethod(java.lang.String,[Ljava.lang.Class;,) throws java.lang.NoSuchMethodException,java.lang.SecurityException,
public [Ljava.lang.reflect.Method; getDeclaredMethods() throws java.lang.SecurityException,
public native java.lang.Class getDeclaringClass()
public java.lang.Class getEnclosingClass()
public java.lang.reflect.Constructor getEnclosingConstructor()
public java.lang.reflect.Method getEnclosingMethod()
public [Ljava.lang.Object; getEnumConstants()
public [Ljava.lang.reflect.Type; getGenericInterfaces()
public java.lang.reflect.Type getGenericSuperclass()
public native [Ljava.lang.Class; getInterfaces()
public java.security.ProtectionDomain getProtectionDomain()
public java.io.InputStream getResourceAsStream(java.lang.String,)
public java.lang.String getSimpleName()
public [Ljava.lang.reflect.TypeVariable; getTypeParameters()
public boolean isAnnotationPresent(java.lang.Class,)
public boolean isAnonymousClass()
public boolean isMemberClass()
public final final void wait() throws java.lang.InterruptedException,
public final final void wait(long,int,) throws java.lang.InterruptedException,
public final final native void wait(long,) throws java.lang.InterruptedException,
public boolean equals(java.lang.Object,)
public native int hashCode()
public final final native java.lang.Class getClass()
public final final native void notify()
public final final native void notifyAll()   */