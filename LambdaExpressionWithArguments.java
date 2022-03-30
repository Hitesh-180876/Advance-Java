
@FunctionalInterface
interface Lambda{
    public int display(int x, int y);
}


public class MyClass {
    public static void main(String args[]) {
        Lambda m =(a, b)->{ return a+b;};
        int r = m.display(10, 20);
        System.out.println(r);
        
    }
}
