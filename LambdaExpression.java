@FunctionalInterface
interface MyLambda{
    void display();
}
public class MyClass {
    public static void main(String args[]) {
        MyLambda m = ()->{
            System.out.println("Hello Java");
        };
        m.display();
    }
}
