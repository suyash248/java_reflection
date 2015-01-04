import java.lang.reflect.*;
import java.io.*;
class Samplefield
{
 public static void printfield(String s)
 {
  try
  {
   Class c=Class.forName(s);
   Field f[]=c.getFields();        //If there are 'n' fields in a class then 'n' objects of "Field" class will be created and are stored in the
   for(int j=0;j<f.length;j++)        //array of length=n.Each object of "Field" class will represent one field of that class.
   {                                        //"Field" class is found in 'java.lang.reflect' package and 'getFields()' is a method of "Class" class.   
    System.out.println(" ");
    Class type=f[j].getType();
    System.out.print(type.getName());
    System.out.println(" "+f[j].getName());
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
   System.out.println("Datamembers of class "+s+" are : ");
   printfield(s);
  }catch(Exception e){System.out.println(e);}
 }
}

/* OUTPUT-

Enter the class name with full package
java.lang.Thread
Datamembers of class java.lang.Thread are :

int MIN_PRIORITY

int NORM_PRIORITY

int MAX_PRIORITY  */