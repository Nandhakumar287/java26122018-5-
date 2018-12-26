import java.io.*;
import java.util.*;
  public class Append{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String input=sc.next();
      StringBuffer str=new StringBuffer(input);
      str.append(".");
      System.out.println(str);
      }
    }  
