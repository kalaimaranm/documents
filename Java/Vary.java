import java.util.*;
public class Vary{
 
public static void main(String args[]){
//System.out.println(a);
Vary v = new Vary();
 v.second();
 System.out.println("This is main method");
 //second();
 
}
public static void second(){
Vary vv = new Vary();
System.out.println("Before static");
 
 static {
 int a = 10;
 System.out.println("Inside the static block");
 }
}
}
