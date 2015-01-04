import java.io.*;
class Pw
{
 public static void main(String... l)throws IOException
 {
  PrintWriter pw=new PrintWriter(new FileWriter("abc.txt"));
  pw.println("Hello");
  pw.println("Hi");
  pw.close();
  System.out.println("File created");
 }
}