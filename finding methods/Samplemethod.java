import java.lang.reflect.*;
import java.io.*;
class Samplemethod
{
 public static void printmethod(String s)
 {
  try
  {
   Class c=Class.forName(s);
   Method m[]=c.getMethods();
   for(int i=0;i<m.length;i++)
   {
    Class returntype=m[i].getReturnType();
    System.out.print(returntype.getName());  // print the RETURN TYPE of the method. 
    System.out.print(" "+m[i].getName());    // print the NAME of the method.
    System.out.print("(");
    Class type[]=m[i].getParameterTypes();
    for(int k=0;k<type.length;k++)
    { 
     System.out.print(type[k].getName()+",");  //print the ARGUMENTS of the method.
    }
    System.out.print(")");
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

/*OUTPUT-
Enter the class name with full package
java.lang.String
Methods of class java.lang.String are :
boolean equals(java.lang.Object,)
java.lang.String toString()
int hashCode()
int compareTo(java.lang.String,)
int compareTo(java.lang.Object,)
int indexOf(int,int,)
int indexOf(java.lang.String,int,)
int indexOf(java.lang.String,)
int indexOf(int,)
java.lang.String valueOf(java.lang.Object,)
java.lang.String valueOf([C,int,int,)
java.lang.String valueOf([C,)
java.lang.String valueOf(float,)
java.lang.String valueOf(double,)
java.lang.String valueOf(int,)
java.lang.String valueOf(boolean,)
java.lang.String valueOf(char,)
java.lang.String valueOf(long,)
char charAt(int,)
int codePointBefore(int,)
int codePointCount(int,int,)
int compareToIgnoreCase(java.lang.String,)
boolean contentEquals(java.lang.StringBuffer,)
boolean contentEquals(java.lang.CharSequence,)
boolean equalsIgnoreCase(java.lang.String,)
int offsetByCodePoints(int,int,)
boolean regionMatches(int,java.lang.String,int,int,)
boolean regionMatches(boolean,int,java.lang.String,int,int,)
int codePointAt(int,)
java.lang.String concat(java.lang.String,)
boolean contains(java.lang.CharSequence,)
java.lang.String copyValueOf([C,)
java.lang.String copyValueOf([C,int,int,)
boolean endsWith(java.lang.String,)
java.lang.String format(java.util.Locale,java.lang.String,[Ljava.lang.Object;,)
java.lang.String format(java.lang.String,[Ljava.lang.Object;,)
void getBytes(int,int,[B,int,)
[B getBytes()
[B getBytes(java.nio.charset.Charset,)
[B getBytes(java.lang.String,)
void getChars(int,int,[C,int,)
java.lang.String intern()
boolean isEmpty()
int lastIndexOf(java.lang.String,)
int lastIndexOf(int,int,)
int lastIndexOf(int,)
int lastIndexOf(java.lang.String,int,)
int length()
boolean matches(java.lang.String,)
java.lang.String replace(char,char,)
java.lang.String replace(java.lang.CharSequence,java.lang.CharSequence,)
java.lang.String replaceAll(java.lang.String,java.lang.String,)
java.lang.String replaceFirst(java.lang.String,java.lang.String,)
[Ljava.lang.String; split(java.lang.String,int,)
[Ljava.lang.String; split(java.lang.String,)
boolean startsWith(java.lang.String,int,)
boolean startsWith(java.lang.String,)
java.lang.CharSequence subSequence(int,int,)
java.lang.String substring(int,int,)
java.lang.String substring(int,)
[C toCharArray()
java.lang.String toLowerCase()
java.lang.String toLowerCase(java.util.Locale,)
java.lang.String toUpperCase(java.util.Locale,)
java.lang.String toUpperCase()
java.lang.String trim()
void wait()
void wait(long,int,)
void wait(long,)
java.lang.Class getClass()
void notify()
void notifyAll()  */


/* OUTPUT-
Enter the class name with full package
java.lang.Runnable
Methods of class java.lang.Runnable are :
void run()  */


//NOTE-
/* If there are 'n' methods in a class then 'n' objects of "Method" class will be created and are 
     stored in the array of length=n.Each object of "Method" class will represent one method of
      that class. "Method" class is found in 'java.lang.reflect' package and 'getMethods()' is a 
      method of "Class" class.  */