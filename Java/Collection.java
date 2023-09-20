import java.util.*;
public class Main
{
	public static void main(String[] args) {
Collection c = new TreeSet();
c.add(5);
c.add(1);
c.add(7);
c.add(2);
System.out.println(c);
Generic<Integer> g = new Generic<Integer>(123);
g.second();
	}
}
public class Generic<T>{	
    T type;
    Generic(any){
        this.any = any;
        System.out.println(any);
    }
    public static void second(){
    System.out.println(any);
    }
}

